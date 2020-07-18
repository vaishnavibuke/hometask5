package task_2;

import java.util.Scanner;

public class House {
	public static void main(String[] args) {
		
		ConstructionCost costOfMaterial = new ConstructionCost();
		Scanner sc = new Scanner(System.in) ;
		int choice  ;
		
		
		System.out.println("******************************************************************************");
		System.out.println("\t\tWelcome to Colonial Housing Solution");
		System.out.println("******************************************************************************");
		System.out.println("\t\t       --HOUSING MADE EASIER--");
		System.out.println("******************************************************************************");
		
		
		
		System.out.println("\tEnter Grade of material of your choice : ");
		System.out.println("\t   1 : SUB-STANDARD MATERIAL");
		System.out.println("\t   2 : STANDARD MATERIAL");
		System.out.print("\t   3 : HIGH-STANDARD MATERIAL\n   ");
		choice = sc.nextInt() ;
		switch(choice) {
		case 1 :
			costOfMaterial.setMaterialGrade(1);
			costOfMaterial.calculateCost();
			System.out.println("\tEstimated Housing construction Cost : " + costOfMaterial.getMaterialCost());
			break ;
		case 2 :
			costOfMaterial.setMaterialGrade(2);
			costOfMaterial.calculateCost();
			System.out.println("\tEstimated Housing construction Cost : " + costOfMaterial.getMaterialCost());
			break ;
		case 3 :
			String autoChar ;
			System.out.print("Do you wish the house to be automated (Y/N)? : ");
			autoChar = sc.next() ;
			if(autoChar.equals("Y"))
				costOfMaterial.setMaterialGrade(4);
			else
				costOfMaterial.setMaterialGrade(3);
			costOfMaterial.calculateCost();
			System.out.println("\tEstimated Housing construction Cost : " + costOfMaterial.getMaterialCost());
			break ;
			
			
		
		}
	}
	
}
