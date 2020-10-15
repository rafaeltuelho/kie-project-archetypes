# Decision and Rules Project

> project generated using template (maven archetype)

after deploying this kjar into a kie-server you can test the API using the following payload samples:

## DMN Decision
`GET`  http://localhost:8080/kie-server/services/rest/server/containers/<container-id>/dmn 

copy the `model-namespace` and the `model-name`

`POST` http://localhost:8080/kie-server/services/rest/server/containers/<container-id>/dmn 
```json
{
  "model-namespace": "https://kiegroup.org/dmn/_4502BB15-E55D-4302-91EA-CFD7E2EA470C",
  "model-name": "Loan Approval",
  "decision-name" : [ ],
  "dmn-context" : 
    {
        "Credit Score" : 800,
        "DTI" : 0.2
    }
}
```

Response:

```json
{
    "type": "SUCCESS",
    "msg": "OK from container 'rules-archetype'",
    "result": {
        "dmn-evaluation-result": {
            "messages": [],
            "model-namespace": "https://kiegroup.org/dmn/_4502BB15-E55D-4302-91EA-CFD7E2EA470C",
            "model-name": "Loan Approval",
            "decision-name": [],
            "dmn-context": {
                "Loan Approval": "Approved",
                "DTI": 0.2,
                "Credit Score": 800
            },
            "decision-results": {
                "_C970A1A1-83F1-4590-BE74-EF1E46558069": {
                    "messages": [],
                    "decision-id": "_C970A1A1-83F1-4590-BE74-EF1E46558069",
                    "decision-name": "Loan Approval",
                    "result": "Approved",
                    "status": "SUCCEEDED"
                }
            }
        }
    }
}
```

## XLS decision Table rule base

`POST` http://localhost:8080/kie-server/services/rest/server/containers/instances/<conatiner id>

```json
{
    "lookup": "stateless-session",
    "commands": [
        {
            "insert": {
                "object": {
                    "com.redhat.demos.decisiontable.Driver": {
                        "name": "Mr Joe Blogs",
                        "age": 30,
                        "priorClaims": 0,
                        "locationRiskProfile": "LOW"
                    }
                },
                "out-identifier": "driver_fact_out",
                "return-object": true
            }
        },
        {
            "insert": {
                "object": {
                    "com.redhat.demos.decisiontable.Policy": {
                        "type": "COMPREHENSIVE",
                        "discountPercent": 0
                    }
                },
                "out-identifier": "policy_fact_out",
                "return-object": true
            }
        },
        {
            "fire-all-rules": {
                "max": -1,
                "out-identifier": "fired"
            }
        },
        {
            "get-objects": {
                "out-identifier": "facts"
            }
        }
    ]
}
```

Response:

```json
{
    "type": "SUCCESS",
    "msg": "Container rules-archetype successfully called.",
    "result": {
        "execution-results": {
            "results": [
                {
                    "value": 3,
                    "key": "fired"
                },
                {
                    "value": {
                        "com.redhat.demos.decisiontable.Driver": {
                            "name": "Mr Joe Blogs",
                            "age": 30,
                            "priorClaims": 0,
                            "locationRiskProfile": "LOW"
                        }
                    },
                    "key": "driver_fact_out"
                },
                {
                    "value": {
                        "com.redhat.demos.decisiontable.Policy": {
                            "type": "COMPREHENSIVE",
                            "approved": false,
                            "discountPercent": 20,
                            "basePrice": 120
                        }
                    },
                    "key": "policy_fact_out"
                },
                {
                    "value": [
                        {
                            "com.redhat.demos.decisiontable.Driver": {
                                "name": "Mr Joe Blogs",
                                "age": 30,
                                "priorClaims": 0,
                                "locationRiskProfile": "LOW"
                            }
                        },
                        {
                            "com.redhat.demos.decisiontable.Policy": {
                                "type": "COMPREHENSIVE",
                                "approved": false,
                                "discountPercent": 20,
                                "basePrice": 120
                            }
                        }
                    ],
                    "key": "facts"
                }
            ],
            "facts": [
                {
                    "value": {
                        "org.drools.core.common.DefaultFactHandle": {
                            "external-form": "0:1:1664356063:1664356063:1:DEFAULT:NON_TRAIT:com.redhat.demos.decisiontable.Driver"
                        }
                    },
                    "key": "driver_fact_out"
                },
                {
                    "value": {
                        "org.drools.core.common.DefaultFactHandle": {
                            "external-form": "0:2:1235907157:1235907157:2:DEFAULT:NON_TRAIT:com.redhat.demos.decisiontable.Policy"
                        }
                    },
                    "key": "policy_fact_out"
                }
            ]
        }
    }
}
```