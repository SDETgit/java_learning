package A002_OOPS_Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class P002_Runtime_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.makeSound();  // Prints "Bark"

		a = new Cat();
		a.makeSound();  // Prints "Meow"
	}

}
