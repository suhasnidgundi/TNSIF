import java.util.Scanner;

public class MethodOverloadingDemo {

    public static void demonstrate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Method Overloading Demonstration ===");

        Calculator calc = new Calculator();

        // Integer addition
        System.out.println("1. Integer Addition:");
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        int result1 = calc.add(a, b);
        System.out.println("Result: " + result1);

        // Double addition
        System.out.println("\n2. Double Addition:");
        System.out.print("Enter first double: ");
        double x = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double y = scanner.nextDouble();
        double result2 = calc.add(x, y);
        System.out.println("Result: " + result2);

        // Three integers addition
        System.out.println("\n3. Three Integers Addition:");
        System.out.print("Enter first integer: ");
        int p = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int q = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int r = scanner.nextInt();
        int result3 = calc.add(p, q, r);
        System.out.println("Result: " + result3);

        // String concatenation
        System.out.println("\n4. String Addition (Concatenation):");
        scanner.nextLine(); // consume newline
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        String result4 = calc.add(str1, str2);
        System.out.println("Result: " + result4);

        // Area calculations
        System.out.println("\n=== Area Calculator Demo ===");
        AreaCalculator areaCalc = new AreaCalculator();

        // Circle area
        System.out.print("Enter radius for circle: ");
        double radius = scanner.nextDouble();
        double circleArea = areaCalc.calculateArea(radius);
        System.out.println("Circle Area: " + circleArea);

        // Rectangle area
        System.out.print("Enter length for rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width for rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = areaCalc.calculateArea(length, width);
        System.out.println("Rectangle Area: " + rectangleArea);

        // Triangle area
        System.out.print("Enter base for triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height for triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = areaCalc.calculateArea(base, height, "triangle");
        System.out.println("Triangle Area: " + triangleArea);

        // Display method demonstrations
        System.out.println("\n=== Display Method Overloading ===");
        DisplayHelper display = new DisplayHelper();

        display.show(42);
        display.show(3.14159);
        display.show("Hello, World!");
        display.show(true);
        display.show(new int[]{1, 2, 3, 4, 5});
    }
}

/**
 * Calculator class demonstrating method overloading
 */
class Calculator {

    // Method overloading: same name, different parameter types/numbers

    // Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // Add two strings (concatenation)
    public String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + " " + b;
    }

    // Multiply methods
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

/**
 * AreaCalculator class demonstrating overloaded area calculations
 */
class AreaCalculator {

    // Calculate area of circle (one parameter)
    public double calculateArea(double radius) {
        System.out.println("Calculating circle area");
        return Math.PI * radius * radius;
    }

    // Calculate area of rectangle (two parameters)
    public double calculateArea(double length, double width) {
        System.out.println("Calculating rectangle area");
        return length * width;
    }

    // Calculate area of triangle (two parameters + string identifier)
    public double calculateArea(double base, double height, String shape) {
        System.out.println("Calculating triangle area");
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        }
        return 0;
    }

    // Calculate area of square (different from rectangle logically)
    public double calculateArea(int side) {
        System.out.println("Calculating square area");
        return side * side;
    }
}

/**
 * DisplayHelper class demonstrating overloaded display methods
 */
class DisplayHelper {

    public void show(int value) {
        System.out.println("Integer value: " + value);
    }

    public void show(double value) {
        System.out.println("Double value: " + value);
    }

    public void show(String value) {
        System.out.println("String value: " + value);
    }

    public void show(boolean value) {
        System.out.println("Boolean value: " + value);
    }

    public void show(int[] array) {
        System.out.print("Array values: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}