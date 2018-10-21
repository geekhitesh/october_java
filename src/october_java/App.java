package october_java;

public class App {

	public static void main(String args[]) {
		
		AdvanceAnimal animal = new AdvanceAnimal();
		animal.name = "Elephant";
		animal.type = "Herbivorous";
		animal.setAge(20);
		
		animal.sleep();
		
		AdvanceAnimal animal2 = new AdvanceAnimal();
		animal2.name = "Lion";
		animal2.type = "Carnivorous";
		animal2.setAge(5);
		animal2.sleep();
		
	}
}
