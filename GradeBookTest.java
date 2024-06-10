import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * GradeBookTester is a test class for the GradeBook class.
 * It tests various methods of the GradeBook class to ensure 
 * they work properly.
 * 
 * @author JessicaPark
 * 
 */


public class GradeBookTester {
	private GradeBook g1;
    private GradeBook g2;
    
    
    /**
     * Sets up the test environment before each test.
     * Initializes two GradeBook objects and adds scores to them.
     */

       
    @Before
    public void setUp() {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        g1.addScore(50.0);
        g1.addScore(75.0);

        g2.addScore(80.0);
        g2.addScore(60.0);
    }
    
    /**
     * Cleans up the test environment after each test.
     * Sets the GradeBook objects to null to save memory.
     */
    @After
    public void tearDown(){
        g1 = null;
        g2 = null;
    }

    /** 
     * Test the addScore method
     * When a score is added, the toString method
     * sends back an array with the added scores.
     */
    
  
    @Test
    public void testAddScore(){
        assertTrue(g1.toString().equals("50.0 75.0"));
        assertTrue(g2.toString().equals("80.0 60.0"));

        assertEquals(2, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());

    }
   

    /**
     * Tests if the sum method works correctly.
     * This method should add up the sum of all the scores
     */
    
    @Test
    public void testSum(){
        assertEquals(125, g1.sum(), .0001);
        assertEquals(140, g2.sum(), .0001);
    }
    
    /** Tests the minimum method which returns the smallest double.
     * 
     */

    @Test
    public void testMinimum(){
        assertEquals(50, g1.minimum(), .001);

    }
    
    /** Tests the finalScore method which must 
     * return the sum of all the scores, except the lowest.
     */

    @Test
    public void testFinalScore(){
        assertEquals(75.0, g1.finalScore(), 0.0001);
        assertEquals(80.0, g2.finalScore(), 0.0001);
    }
}
