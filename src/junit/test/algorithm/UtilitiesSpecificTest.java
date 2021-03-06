package junit.test.algorithm;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesSpecificTest {
    private Utilities util;
    private String input, output;

    @org.junit.Before
    public void setUp(){
        util= new Utilities();
    }

    public UtilitiesSpecificTest(String input, String output) {
        this.input = input;
        this.output = output;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> specialTestCondition(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }
    @org.junit.Test
    public void removePairs() {
        assertEquals(output, util.removePairs(input));
    }

}
