import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the JavaUnitTest
 */
public class JavaUnitTestTest 
extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JavaUnitTestTest( String testName )
    {
        super( testName );
    }

    /** 
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( JavaUnitTestTest.class );
    }

    public void test_Simple()
    {
 	assertEquals(true, true);	      
    }
}
