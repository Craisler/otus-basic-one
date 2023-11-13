import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.otus.java.basic.hw22.Main.*;

public class MainTest {
    @Test
    public void checkOnlyOneTwoTest() {
        int[] arrays1 = new int[]{1, 2};
        int[] arrays2 = new int[]{1, 1};
        int[] arrays3 = new int[]{1, 3};
        int[] arrays4 = new int[]{1, 2, 2, 1};
        Assertions.assertTrue(checkOnlyOneTwo(arrays1));
        Assertions.assertFalse(checkOnlyOneTwo(arrays2));
        Assertions.assertFalse(checkOnlyOneTwo(arrays3));
        Assertions.assertTrue(checkOnlyOneTwo(arrays4));
    }

    @Test
    public void returnAfterOneTest() {
        int[] arrays5 = {1, 2, 1, 2, 2};
        int[] arrReturn = {2, 2};
        Assertions.assertArrayEquals(arrReturn, returnAfterOne(arrays5));
    }

    @Test
    public void returnAfterOneExceptionTest() {
        int[] arrays6 = {2, 2, 2, 2, 2};
        Assertions.assertThrows(RuntimeException.class, () -> returnAfterOne(arrays6));
    }
}
