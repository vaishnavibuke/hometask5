package test_task_2;

import static org.junit.Assert.*;

import org.junit.Test;

import task_2.ConstructionCost;

public class ConstructionCostTester {
	ConstructionCost testMaterial ;
	int testMaterialCost ;

	@Test
	public void test() {
		testMaterial = new  ConstructionCost();
		
		//Testing for sub-standard material
		testMaterial.setMaterialGrade(1);
		testMaterial.calculateCost();
		testMaterialCost = testMaterial.getMaterialCost();
		assertEquals(1200, testMaterialCost, 0);
		
		//Testing for standard material
		testMaterial.setMaterialGrade(2);
		testMaterial.calculateCost();
		testMaterialCost = testMaterial.getMaterialCost();
		assertEquals(1500, testMaterialCost, 0);
		
		//Testing for high-standard material
		testMaterial.setMaterialGrade(3);
		testMaterial.calculateCost();
		testMaterialCost = testMaterial.getMaterialCost();
		assertEquals(1800, testMaterialCost, 0);
		
		//Testing for sub-standard material
		testMaterial.setMaterialGrade(4);
		testMaterial.calculateCost();
		testMaterialCost = testMaterial.getMaterialCost();
		assertEquals(2500, testMaterialCost, 0);
	}
	
	
	



}
