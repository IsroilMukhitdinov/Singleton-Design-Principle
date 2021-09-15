
public class Main {
	
	public static void main(String[] args) {
		
		Stage stage1 = Stage.getStage();
		Stage stage2 = Stage.getStage();
		Stage stage3 = Stage.getStage();
		
		System.out.println(stage3.getNumberOfObjects());
		
		// only one object gets created, many references can be there though all referencing the same object in memory
	}

}
