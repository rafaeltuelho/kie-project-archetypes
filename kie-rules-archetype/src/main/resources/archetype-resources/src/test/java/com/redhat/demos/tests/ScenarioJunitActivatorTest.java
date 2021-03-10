package com.redhat.demos.tests;
/**
* Use this class if you play to run scesim on Business Central with Drools.
* Remember to comment out the Drools scenariosimulation deps in pom.xml!
*/
// uncomment when executing from maven or vscode
// @org.junit.runner.RunWith(org.kogito.scenariosimulation.runner.KogitoJunitActivator.class)
@org.junit.runner.RunWith(org.drools.scenariosimulation.backend.runner.ScenarioJunitActivator.class)
public class ScenarioJunitActivatorTest {
}