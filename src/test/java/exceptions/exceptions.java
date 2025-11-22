package exceptions;

import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class exceptions {

    @Test
    void exception() {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Нельзя посчитать длину строки null");
        }

        System.out.println("Но программа все равно выполняется дальше");

        try {
            Assertions.assertTrue(false, "Тест упал");
        } catch (AssertionError e) {
            System.out.println("Возникла ошибка: " + e.getMessage());
        }

        System.out.println("Но программа все равно выполняется дальше");

        //System.out.println(null);
        //Assertions.assertTrue(false);

    }

}
