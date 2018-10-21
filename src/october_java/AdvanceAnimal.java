package october_java;

public class AdvanceAnimal {
	
	public String name;
	public String type;
	private Integer age;
	
	public void eat() {
		
		System.out.println("Animal "+this.name + " is eating. His age is:"+this.age);
	}
	
	public void sleep() {
		
		System.out.println("Animal "+this.name + " is sleeping. His age is:"+this.age);
		
	}
	
	public void walk() {
		
		System.out.println("Animal "+this.name +" is walking. His age is:"+this.age);	
	}
	
	
	public void setAge(int age) {
		if(age <10)
		{
			System.out.println("Entered age cannot be less than 5. Please try again.");
			this.age=0;
		}
		else
		{
			this.age = age;
		}
	}
	
	
	
	

}
