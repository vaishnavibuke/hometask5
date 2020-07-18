package task_1;

public class SimpleInterest {
	
	public double calculateSimpleInterest(Borrower b) {
		//Calculating Equivalent Amount
		return ((b.getPrinicipleAmount() * b.getRateOfInterest() * b.getPeriodInYears())/100);
	}
	
	public double calculateEquivalentAmount(Borrower b) {
		//Calculates equivalent amount at the end of a certain period at given rate of interest.
		return (b.getPrinicipleAmount() + calculateSimpleInterest(b)) ;
	}
	
	
}
