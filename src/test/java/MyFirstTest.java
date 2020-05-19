import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    //Create a test method that uses assertEquals or assertNotEquals to
    //  verify if the String Codeup is the same as CodeUp.
    @Test
    public void testIfCompanyNameEquals(){

        String company ="Codeup";
//        String actual = "Codeup"
        assertEquals("Codeup", company);
        assertNotEquals("CodeUp", company);
    }

    @Test
    public void arrayListsAreNotTheSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }
//
    @Test
    public void arraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;


        assertArrayEquals(numbers, otherNumbers);


    }

    @Test
    public void booleanStatements(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement


        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));


        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));


    }



}
