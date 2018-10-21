package october_java;

public class Animal {
	
	public String name;
	public String type;
	public int age;
	
	public void eat() {
		
		System.out.println("Animal "+this.name + " is eating. His age is:"+this.age);
	}
	
	public void sleep() {
		
		System.out.println("Animal "+this.name + " is sleeping. His age is:"+this.age);
		
	}
	
	public void walk() {
		
		System.out.println("Animal "+this.name +" is walking. His age is:"+this.age);	
	}
	
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.name = "Elephant";
		animal.type = "Herbivorous";
		animal.age = 10;
		
		animal.sleep();
		
		Animal animal2 = new Animal();
		animal2.name = "Lion";
		animal2.type = "Carnivorous";
		animal2.age = 20;
		
		animal2.sleep();
		
		Animal animal3 = animal;
		animal3.age=-10;
		animal3.sleep();
		
		
	}

}
