package junit.test.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class  UtilitiesTest {
    private Utilities utilities;
    @org.junit.Before
    public void setUtilities(){
        utilities= new Utilities();
    }

    @Test
    public void returnNthValue() {
        char[] chars= {'h', 'e', 'l','l', 'o'};
        char[] expected= {'e', 'l'};
      assertArrayEquals(expected,utilities.returnNthValue(chars, 2));
      assertArrayEquals(chars, utilities.returnNthValue(chars, 6));
    }

    @Test
    public void removePairs() {
       assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
    }

    @Test
    public void coverter() {
      assertEquals(300, utilities.coverter(10, 5));
     try{
        utilities.coverter(10, 0);
     }catch(ArithmeticException e){
         System.out.println( "ArithmeticException "+ e.getMessage());
     }
    }

    @Test
    public void nullIfOddlenght() {
        String str= "abcdef";
        assertEquals("abcdef",utilities.nullIfOddLenght(str));
        assertNull(null, utilities.nullIfOddLenght("abcdefg"));
    }
}