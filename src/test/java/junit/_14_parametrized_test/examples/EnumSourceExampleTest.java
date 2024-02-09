package junit._14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * EnumSource is an annotation in JUnit 5 used for parameterized tests where you need to pass enum values as parameters.
 * It's particularly useful when you want to run a test method with different values from an enumeration.
 */
public class EnumSourceExampleTest {

    @Nested
    class StatusTest {
        enum Status {
            ACTIVE, INACTIVE, DELETED;
        }

        /**
         * The enum to be used as the source of parameters is specified in the @EnumSource.
         */
        @ParameterizedTest
        @EnumSource(Status.class)
        void testStatus(Status status) {
            Assertions.assertNotNull(status);
        }

        /**
         * If you don't specify any enum class explicitly,
         * JUnit will infer the enum type from the test method's parameter type.
         */
        @ParameterizedTest
        @EnumSource
        void testStatusWithoutSpecifying(Status status) {
            Assertions.assertNotNull(status);
        }


    }

    @Nested
    class RoleTest {
        enum Role {
            ADMIN, USER, GUEST;
        }

        /**
         * You can optionally specify which specific enum constants to use in your tests.
         * If not specified, all constants of the enum type are used.
         */
        @ParameterizedTest
        @EnumSource(value = Role.class, names = {"ADMIN", "USER"})
        void testValidRoles(Role role) {
            Assertions.assertTrue(role == Role.ADMIN || role == Role.USER);
        }
    }


    @Nested
    class PlanetTest {
        enum Planet {
            MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
        }

        /**
         * It's also possible to exclude certain enum constants from being used in the test.
         */
        @ParameterizedTest
        @EnumSource(value = Planet.class, mode = EnumSource.Mode.EXCLUDE, names = {"EARTH"})
        void testNonEarthPlanets(Planet planet) {
            assertNotEquals(Planet.EARTH, planet);
        }
    }

}
