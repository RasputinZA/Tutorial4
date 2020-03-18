package za.ac.cput.Projects;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void interfaceTest() {

        placeInterface it = new placeInterfaceImpl();

        String result = it.residence("Cape Town");

        Assert.assertEquals("Current residence:  Cape Town", result);

    }
}
