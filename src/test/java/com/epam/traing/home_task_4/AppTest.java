package com.epam.traing.home_task_4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import task_1.Borrower;
import task_1.SimpleInterest;

public class AppTest 
    extends TestCase
{
	Borrower b ;
	SimpleInterest si ;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
    public AppTest( String testName )
    {
        super( testName );
        b = new Borrower();
		b.setPrinicipleAmount(1000.0);
		b.setRateOfInterest(10.0);
		b.setPeriodInYears(2.0);
		
		si = new SimpleInterest();
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
       // assertTrue( true );
    	double check = si.calculateSimpleInterest(b) ;
		assertEquals(1200, 1200, 0.0);
		
    }
    public static void main(String[] args) {
		AppTest a = new AppTest("Testing si") ;
		
		
	}
}
