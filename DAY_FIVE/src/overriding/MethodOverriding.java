package overriding;

public class MethodOverriding {
    public static void demonstrate() {
        System.out.println("🔄 Method Overriding Demonstration:\n");

        // Parent reference, parent object
        Animal animal = new Animal();
        animal.makeSound();
        animal.sleep();

        // Parent reference, child object (Runtime Polymorphism)
        Animal dog = new Dog();
        dog.makeSound(); // Overridden method called
        dog.sleep();     // Inherited method called

        // Child reference, child object
        Dog myDog = new Dog();
        myDog.makeSound(); // Overridden method
        myDog.wagTail();   // Dog-specific method

        System.out.println("\n🎯 Key Points:");
        System.out.println("✅ Method signature must be exactly same");
        System.out.println("✅ @Override annotation is recommended");
        System.out.println("✅ Runtime polymorphism is achieved");
        System.out.println("✅ Cannot override private, static, or final methods");
    }
}

class Animal {
    public void makeSound() {
        System.out.println("🐾 Animal makes some sound");
    }

    public void sleep() {
        System.out.println("😴 Animal sleeps");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("🐕 Dog barks: Woof! Woof!");
    }

    // Dog-specific method
    public void wagTail() {
        System.out.println("🐕 Dog wags tail happily");
    }
}
