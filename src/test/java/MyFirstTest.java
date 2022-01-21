import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void codeupIsNotCodeup() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void davidIsDavid() {
        String instructor = "David";
        String testWriter = "David";

        Assert.assertEquals(instructor, testWriter);
    }

    @Test
    public void listAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> names =  new ArrayList<>();
        languages.add("Latin");
        names.add("Latin");

//        Assert.assertEquals(languages, names);
        Assert.assertNotSame(languages, names);
    }

    @Test
    public void arraysAreEqual() {
        int[] numbers = {1,2,3};
        int[] otherNumbers = new int [3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void funWithPHP() {
        String language = "PHP";
        Assert.assertTrue(language.contains("H"));
        Assert.assertFalse(language.contains("J"));
    }
}
