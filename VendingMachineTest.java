

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine machine = new VendingMachine();
        machine.insertToken();
        int tokens = machine.getTokenCount();
        assertEquals(tokens,1);
    }
    
    @Test
    public void testfillUp(){
    VendingMachine machine = new VendingMachine();
    machine.fillUp();
    int cans = machine.getCanCount();
    assertEquals(cans,10);
    }
}
