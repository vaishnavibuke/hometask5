package test_task_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import task_1.Borrower;
import task_1.CompoundInterest;
import task_1.SimpleInterest;

public class TestCompoundInterest {
	Borrower b ;
	CompoundInterest ci ;
	
	@Test
	public void testSI() {
		b = new Borrower();
		b.setPrinicipleAmount(1000.0);
		b.setRateOfInterest(10.0);
		b.setPeriodInYears(2.0);
		
		ci = new CompoundInterest();
	double check = ci.calCompoundInterest(b) ;
	assertEquals(210.0, check, 0.0);

	}

}
