package _12_test_interfaces_and_default_methods.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * interfaces and default methods can be useful if you need to create contract test.
 */
public class ContractExampleTest {

    static class AnimalAdultContractTest implements AdultContract<Animal> {
        @Override
        public Animal create() {
            return new Animal(12);
        }
    }

    static class PersonAdultContractTest implements AdultContract<Person> {
        @Override
        public Person create() {
            return new Person(19);
        }
    }


}

interface AdultContract<T extends IsAdult> {
    T create();

    @Test
    default void testAge() {
        T t = create();
        Assertions.assertTrue(t.age() > t.getAdultAgeMinimum());
    }
}

interface IsAdult {
    int age();

    int getAdultAgeMinimum();
}

record Animal(int age) implements IsAdult {
    @Override
    public int getAdultAgeMinimum() {
        return 4;
    }
}

record Person(int age) implements IsAdult {
    @Override
    public int getAdultAgeMinimum() {
        return 18;
    }
}
