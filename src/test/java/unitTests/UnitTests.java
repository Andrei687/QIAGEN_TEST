package unitTests;

import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class UnitTests {

    @Test
    public void testPascalHappyFlow()
    {
        int value = Main.PascalTriangle(0,2);
        Assertions.assertEquals(1, value);
    }

    @Test
    public void testPascalNegativeFlow()
    {
        int value = Main.PascalTriangle(-1,2);
        Assertions.assertEquals(0, value);
    }

    @Test
    public void testParenthesesBalancingHappyFlow()
    {
        List<Character> listOfChars = List.of('(', 'i', 'f', ' ', '(', 'z', 'e', 'r', 'o', '?', ' ', 'x', ')', ' ', 'm', 'a', 'x', ' ', '(', '/', ' ', '1', ' ', 'x', ')', ')');
        boolean result = Main.ParenthesesBalancing(listOfChars);
        Assertions.assertTrue(result);
    }

    @Test
    public void testParenthesesBalancingNegativeFlow()
    {
        List<Character> listOfChars = List.of(':','-',')');
        boolean result = Main.ParenthesesBalancing(listOfChars);
        Assertions.assertFalse(result);
    }
}
