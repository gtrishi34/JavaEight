package Cnstructor;

//constructor chaining

class Animal {
    private String name;
    private int age;

    // Constructor with two parameters
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor chaining: calls the two-parameter constructor
    public Animal(String name) {
        // Call the two-parameter constructor with default age
        this(name, 0);
    }

    // Constructor chaining: calls the one-parameter constructor
    public Animal() {
        // Call the one-parameter constructor with default name and age
        this("Unknown");
    }

    public Animal(int age) {
    	this.age=age;
	}

	// Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

public void disp() {
	System.out.println(name+", "+age);
}
    public static void main(String[] args) {
        // Create objects using different constructors
        Animal dog = new Animal("Dog", 5);
        Animal cat = new Animal("Cat");
        Animal unknownAnimal = new Animal();
        dog.disp();
        cat.disp();
        unknownAnimal.disp();

        // Print information about the animals
//        System.out.println("Dog: " + dog.getName() + ", " + dog.getAge() + " years old");
//        System.out.println("Cat: " + cat.getName() + ", " + cat.getAge() + " years old");
//        System.out.println("Unknown Animal: " + unknownAnimal.getName() + ", " + unknownAnimal.getAge() + " years old");
    }
}




