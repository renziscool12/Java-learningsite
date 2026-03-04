public class Animal {
    protected String name; // Protected allows access in subclasses

    // Constructor to intialize name
    public Animal(String name) {
        this.name = name;
    }

    // Method to be overriden by subclasses
    public void makeSound() {
        System.out.println("Some generic animals sound");
    }

    // Getters and Setters for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

// Subclass Dog that extends Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass (Animal) to initialize name
    }

    // Override makeSound to provive specific implementation for Dog
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.print(getName() + " says Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound(); // Call the makeSound method of the superclass(Animal)
        System.out.println(getName() + " says Meow!");
    }
    // NOTES:

    // 1. The makeSound method in the Animal class is overridden in both Dog and Cat
    // classes to provide specific implementations for each animal type.
    // 2. Super keyword is telling the subclass that they can change their behavior
    // like the makeSound method but they can also call the original behavior of the
    // superclass if needed.
    // 3. The getName method is used to access the name of the animal, which is
    // inherited from the Animal class.
    // 4. The constructors in the Dog and Cat classes call the constructor of the
    // Animal class using super(name) to initialize the name property.
}
