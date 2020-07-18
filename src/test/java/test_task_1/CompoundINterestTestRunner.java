package test_task_1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CompoundINterestTestRunner {
public static void main(String[] args) {
	Result result = JUnitCore.runClasses(TestCompoundInterest.class);
	
    for (Failure failure : result.getFailures()) {
       System.out.println(failure.toString());
    }
		
    System.out.println(result.wasSuccessful());
}
}
