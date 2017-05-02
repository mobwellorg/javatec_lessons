package online.mobwell;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import online.mobwell.exercises.ChaSwitch;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	public void testjson() {
		ChaSwitch ch = ChaSwitch.getSwitch("{name:\"M04L01_1\", explo:\"testes\", userId:\"123\",files:[{filename:\"ytr.java\",code:\"public\"}]}");
		// ch.getEx().executionResult();
	
	}
}
