/**
 * 
 */
package cmprator;


public class employee {

	private String name;
	private int age;
	private int salary;
	private int pin;
	
	
	public employee(String name, int age, int salary, int pin) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", age=" + age + ", salary=" + salary + ", pin=" + pin + "]";
	}
	
}
