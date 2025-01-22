package com.edu;
class Animal {
    // Method in the base class
    public void Sound() {
        System.out.println("Some Sound");
    }
}

class Dog extends Animal {
    // Overriding the Sound() method in the Dog class
    @Override
    public void Sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    // Overriding the Sound() method in the Cat class
    @Override
    public void Sound() {
        System.out.println("Meow");
    }
}
public class InheritanceProblam {
	public static void main(String[] args) {
		   // Creating objects of the derived classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods
        myDog.Sound();  
        myCat.Sound();  
	}

}
