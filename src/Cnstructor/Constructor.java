package Cnstructor;

public class Constructor {

//	 public  Constructor() {
//	System.out.println("hell");
//	}
//
//public Constructor(int x, int y) {
//	System.out.println(x+y);
//}
public int salary;
public String name;
	// constructor overloading

	public Constructor() {
	this.salary =10000;
	this.name = "rishi";
}

	public Constructor(int salary,String name) {
		this.salary = salary;
		this.name = name;
	}
	
	public Constructor(int salary) {
		this.salary=salary;
	}
	
	public void show() {
		System.out.println(+salary+" "+name);
	}
	public static void main(String[] args) {
		
		Constructor r = new Constructor();
		Constructor s = new Constructor(2000);

		Constructor e = new Constructor(2000,"raj");
		r.show();
		s.show();
		e.show();
		
		}
	}
