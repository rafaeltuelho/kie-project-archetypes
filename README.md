
# Custom Kie Applications Maven Archetypes
This repository contains custom Maven archetypes for KIE KJAR projects. These archetypes can be used both for Upstream and Enterprise versions of Kie projects.

Refer to [this](https://github.com/kiegroup/droolsjbpm-knowledge/tree/master/kie-archetypes/kie-kjar-archetype) repository if you want to create an empty KIE KJAR project.

## kie-rules-archetype
This archetype generates a maven project with Drools (DRL and Excell Decision Table), DMN sample assets and some Unit Test scenarios.

The generated project has the following structure:

```
├── gitignore
├── global
│   ├── WorkDefinitions.wid
├── package-names-white-list
├── pom.xml
├── project.imports
├── project.repositories
├── readme.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── redhat
    │   │           └── demos
    │   │               └── decisiontable
    │   │                   ├── Driver.java
    │   │                   └── Policy.java
    │   └── resources
    │       ├── META-INF
    │       │   ├── kie-deployment-descriptor.xml
    │       │   └── kmodule.xml
    │       └── com
    │           └── redhat
    │               └── demos
    │                   ├── decisiontable
    │                   │   └── ExamplePolicyPricing.xls
    │                   ├── dmn
    │                   │   └── Loan\ Approval.dmn
    │                   └── rules
    │                       └── rulebase.drl
    └── test
        ├── java
        │   └── com
        │       └── redhat
        │           └── demos
        │               └── tests
        │                   ├── RulesBaseTest.java
        │                   ├── RulesTest.java
        │                   └── ScenarioJunitActivatorTest.java
        └── resources
            ├── com
            │   └── redhat
            │       └── demos
            │           └── tests
            │               └── Loan\ Approval\ Test.scesim
            └── logback-test.xml
```

## lombok-data-model-archetype
Generates a simple data-model project leveraging Lombok Annotations to simplify your Pojo definition.

### Related blog post
Read this blog post to see how you can use this archetype as project template on Business Central: 
[Maven archetype support in Business Central](https://medium.com/kie-foundation/maven-archetype-support-in-business-central-b5fdf5e98556)
 
