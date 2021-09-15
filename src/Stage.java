import java.util.ArrayList;

public class Stage {
	
	private ArrayList<Scene> scenes;
	
	private int numberOfObjects = 0;
	
	private static Stage stage = null;
	
	//private constructor
	private Stage() {
		scenes = new ArrayList<Scene>();
		numberOfObjects++;
	}
	
	public int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public ArrayList<Scene> getScenes(){
		return scenes;
	}
	
	public void addScene(Scene scene) {
		scenes.add(scene);
	}
	public void removeScene(Scene scene) {
		scenes.remove(scene);
	}
	
	public static Stage getStage() {
		if (stage == null) {
			return new Stage();
		}
		else {
			return stage;
		}
	}
	
	

}
