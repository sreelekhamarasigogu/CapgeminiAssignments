package lab4.task1;

public class Person {
	private String name;
	private float age;
	public Person(String name,float age) {
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(float age) {
		this.age=age;
	}
	public float getAge() {
		return age;
	}
}
