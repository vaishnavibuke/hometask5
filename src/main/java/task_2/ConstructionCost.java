package task_2;

public class ConstructionCost {
	private int materialGrade;
	private int materialCost ;
	
	public int getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(int materialCost) {
		this.materialCost = materialCost;
	}

	public ConstructionCost() {
		super();
		
	}

	public int getMaterialGrade() {
		return materialGrade;
	}

	public void setMaterialGrade(int materialGrade) {
		this.materialGrade = materialGrade;
	}
	
	public void calculateCost(){
		
		switch(materialGrade) {
		case 1:
			this.materialCost = 1200;
			break;
		case 2:
			this.materialCost = 1500;
			break;
		case 3:
			this.materialCost = 1800;
			break;
		case 4:
			this.materialCost = 2500;
			break;
		
			
		}
		
		
	}

}
