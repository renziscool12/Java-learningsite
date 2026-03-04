import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the type of animal and its name
        System.out.print("Enter animal type (Dog/Cat): ");
        String type = sc.nextLine();

        System.out.print("Enter name ");
        String name = sc.nextLine();

        // Object of type Animal is created based on the user input. If the user enters
        // "Dog", a Dog object is created. If the user enters "Cat", a Cat object is
        // created. Otherwise, a generic Animal object is created.
        Animal animal;

        if (type.equalsIgnoreCase("Dog")) {
            animal = new Dog(name);
        } else if (type.equalsIgnoreCase("Cat")) {
            animal = new Cat(name);
        } else {
            animal = new Animal(name);
        }

        // Call the makeSound method on the animal object. This will invoke the
        // overridden
        animal.makeSound();
        sc.close();

    }
}
