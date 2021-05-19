package CIExamplesTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class HelloWorldTest extends TestCase
{

	public HelloWorldTest(String testName) {
		super(testName);
	}
	
	public static Test suit()
	{
		return new TestSuite(HelloWorldTest.class);
	}
	public void testApp() {
		assertTrue(true);
		System.out.println("hello world");
	}
}
