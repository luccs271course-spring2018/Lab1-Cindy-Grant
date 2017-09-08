package hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ywang83 on 9/8/2017.
 */
public class FBTest {
    @Before
    public void setUp() throws Exception {
        fixture = new FB();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void getNumber() throws Exception {
        int m=10;
        String Expected[]= {"getNumber(n,m)"};
        String output[] = {"1","2","fizz","4","buzz","fizz","7","8","fizz"};
        assertEquals(output,Expected);

}