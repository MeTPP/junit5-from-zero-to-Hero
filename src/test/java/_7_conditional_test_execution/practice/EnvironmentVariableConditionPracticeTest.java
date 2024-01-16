package _7_conditional_test_execution.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentVariableConditionPracticeTest {

    /*
     * TODO: write test that will be enabled if env variable VAR1 == "JUnit5 HERO"
     */
    @Test
    @EnabledIfEnvironmentVariable(named = "VAR1", matches = "JUnit5 HERO")
    void test() {

    }

    /*
     * TODO: write test that will be disabled if env variable VAR2 starts with "testng"
     */
    @Test
    @DisabledIfEnvironmentVariable(named = "VAR2", matches = "^testing.*")
    void test1(){

    }

    /*
     * TODO: write test that will run if both variables matches:
     *  VAR3 == "EZ" , VAR4 =="JAVA"
     */
    @Test
    @EnabledIfEnvironmentVariable(named = "VAR3",matches = "EZ")
    @EnabledIfEnvironmentVariable(named = "VAR4",matches = "JAVA")
    void test3(){

    }


}
