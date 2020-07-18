package test_task_1;

import static org.junit.Assert.*;

import org.junit.Test;

import task_1.Borrower;
import task_1.SimpleInterest;

public class TestSimpleInterest {

	Borrower b ;
	SimpleInterest si ;
	
	@Test
	public void testSI() {
		b = new Borrower();
		b.setPrinicipleAmount(1000.0);
		b.setRateOfInterest(10.0);
		b.setPeriodInYears(2.0);
		
		si = new SimpleInterest();
	double check = si.calculateSimpleInterest(b) ;
	assertEquals(200, check, 0.0);

	}

}
