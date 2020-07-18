package task_1;

public class CompoundInterest {

	public double calCompoundInterest(Borrower b) {
		//Calculating Equivalent Amount
		return calEquivalentAmount(b) - b.getPrinicipleAmount() ;
	}
	
	public double calEquivalentAmount(Borrower b) {
		//Calculates equivalent amount at the end of a certain period at given rate of interest.
		return b.getPrinicipleAmount()*Math.pow((1+(b.getRateOfInterest()/100)), b.getPeriodInYears());
	}
	
	
	
	
}
