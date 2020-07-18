package task_1;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		double principle ; //Principle Amount
		double roi ;       //Rate of Interest
		double period ;    //Period in Years
		int choice ;
		
		Borrower b ;
		SimpleInterest simpleInterestObject ;
		CompoundInterest compoundInterestObject;
		
		Scanner sc = new Scanner(System.in) ;
		
	
	System.out.println("******************************************************************************");
	System.out.println("\t\tWelcome to Enterprise Finance Solution");
	System.out.println("******************************************************************************");
	System.out.println("\t\t       --FINANCING MADE EASIER--");
	System.out.println("******************************************************************************");
	
		
		  System.out.print("\tEnter Principle : "); principle = sc.nextDouble();
		  System.out.print("\tEnter Rate of Interest : "); roi = sc.nextDouble();
		  System.out.print("\tEnter Period in Years : "); period = sc.nextDouble();
		  b = new Borrower(principle, roi, period);
		 
	
	do {
		System.out.println("\n\n\tEnter Choice :\n\t1 . Calculate Simple Interest.\n\t2 . Calculate Compound Interest on the amount.\n\t3 . Exit");
		System.out.print("\t");
		choice = sc.nextInt() ;
		
		switch(choice) {
		case 1 : 
			simpleInterestObject = new SimpleInterest() ;
			System.out.print("\t    Simple Interest on the Amount : "+simpleInterestObject.calculateSimpleInterest(b));
			System.out.print("\t    Equivalent Amount at the end of the Period : " + simpleInterestObject.calculateEquivalentAmount(b));		
			break;
			
		case 2 :
			compoundInterestObject = new CompoundInterest() ;	
			System.out.print("\t    Compound Interest on the Amount : " + compoundInterestObject.calCompoundInterest(b)) ;
			System.out.print("\t    Equivalent Amount at the end of the Period : " + compoundInterestObject.calEquivalentAmount(b));
			break ;
		}
	}while(choice != 3);
	
		
	
	

	
	
		
	}

}
