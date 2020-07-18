package test_task_2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test_task_1.TestCompoundInterest;

public class ConstructionCostTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ConstructionCostTester.class);
		
	    for (Failure failure : result.getFailures()) {
	       System.out.println(failure.toString());
	    }
			
	    System.out.println(result.wasSuccessful());
	}

}
