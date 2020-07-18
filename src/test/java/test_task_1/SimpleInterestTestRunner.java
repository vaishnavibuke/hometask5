package test_task_1;
import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class SimpleInterestTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSimpleInterest.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());

	}

}
