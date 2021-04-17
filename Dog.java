package Objects;

public class Dog {
private int age;
	private String name;
	private double weight;
	
	public Dog(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//Getters (Accessor)
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	//Setters (Mutators)
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Miscellaneous
	public String greetPerson(String pName) {
		return this.name+" greets you, " +pName+ "!";
	}
	
	public String toString() {
		return "This dog is " +this.age+ " years old, its name is "+this.name+ " and it weighs " +this.weight+ " pounds";
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(5, "Greg", 10.65);
		System.out.println(dog1);
		System.out.println(dog1.greetPerson("Ainsley"));
	}
}
