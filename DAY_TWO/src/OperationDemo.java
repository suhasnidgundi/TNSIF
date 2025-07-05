import java.util.Scanner;

public class OperationDemo {

    public static void demonstrateOperations() {
        Scanner scanner = new Scanner(System.in);

        // Arithmetic operators demonstration
        System.out.println("=== Arithmetic Operators Demo ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Division by zero is not allowed!");
        }

        // Unary operators demonstration
        System.out.println("\n=== Unary Operators Demo ===");
        int x = 10;
        System.out.println("Original value of x: " + x);
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("Current value of x: " + x);
        System.out.println("Pre-decrement (--x): " + (--x));
        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("Final value of x: " + x);

        // Relational operators demonstration
        System.out.println("\n=== Relational Operators Demo ===");
        int a = 15, b = 10;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators demonstration
        System.out.println("\n=== Logical Operators Demo ===");
        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p && q (AND): " + (p && q));
        System.out.println("p || q (OR): " + (p || q));
        System.out.println("!p (NOT): " + (!p));
        System.out.println("!q (NOT): " + (!q));

        // Short-circuit evaluation demo
        System.out.println("\n--- Short-circuit Evaluation ---");
        int m = 5, n = 0;
        System.out.println("m = " + m + ", n = " + n);

        // This won't cause division by zero due to short-circuit
        if (n != 0 && m / n > 2) {
            System.out.println("Division performed");
        } else {
            System.out.println("Division avoided due to short-circuit evaluation");
        }

        // Assignment operators demonstration
        System.out.println("\n=== Assignment Operators Demo ===");
        int value = 20;
        System.out.println("Initial value: " + value);

        value += 5;  // value = value + 5
        System.out.println("After += 5: " + value);

        value -= 3;  // value = value - 3
        System.out.println("After -= 3: " + value);

        value *= 2;  // value = value * 2
        System.out.println("After *= 2: " + value);

        value /= 4;  // value = value / 4
        System.out.println("After /= 4: " + value);

        value %= 3;  // value = value % 3
        System.out.println("After %= 3: " + value);

        // Bitwise operators demonstration
        System.out.println("\n=== Bitwise Operators Demo ===");
        int bit1 = 12;  // Binary: 1100
        int bit2 = 10;  // Binary: 1010

        System.out.println("bit1 = " + bit1 + " (Binary: " + Integer.toBinaryString(bit1) + ")");
        System.out.println("bit2 = " + bit2 + " (Binary: " + Integer.toBinaryString(bit2) + ")");

        System.out.println("bit1 & bit2 (AND): " + (bit1 & bit2) +
                " (Binary: " + Integer.toBinaryString(bit1 & bit2) + ")");
        System.out.println("bit1 | bit2 (OR): " + (bit1 | bit2) +
                " (Binary: " + Integer.toBinaryString(bit1 | bit2) + ")");
        System.out.println("bit1 ^ bit2 (XOR): " + (bit1 ^ bit2) +
                " (Binary: " + Integer.toBinaryString(bit1 ^ bit2) + ")");
        System.out.println("~bit1 (NOT): " + (~bit1));

        // Shift operators demonstration
        System.out.println("\n=== Shift Operators Demo ===");
        int shift = 8;  // Binary: 1000
        System.out.println("Original: " + shift + " (Binary: " + Integer.toBinaryString(shift) + ")");
        System.out.println("Left shift << 2: " + (shift << 2) +
                " (Binary: " + Integer.toBinaryString(shift << 2) + ")");
        System.out.println("Right shift >> 2: " + (shift >> 2) +
                " (Binary: " + Integer.toBinaryString(shift >> 2) + ")");

        // Ternary operator demonstration
        System.out.println("\n=== Ternary Operator Demo ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String category = (age < 18) ? "Minor" :
                (age < 60) ? "Adult" : "Senior";
        System.out.println("Age category: " + category);

        // instanceof operator demonstration
        System.out.println("\n=== instanceof Operator Demo ===");
        Object obj1 = "Hello World";
        Object obj2 = 42;
        Object obj3 = 3.14;

        System.out.println("obj1 instanceof String: " + (obj1 instanceof String));
        System.out.println("obj2 instanceof Integer: " + (obj2 instanceof Integer));
        System.out.println("obj3 instanceof Double: " + (obj3 instanceof Double));
        System.out.println("obj1 instanceof Object: " + (obj1 instanceof Object));

        // Operator precedence demonstration
        System.out.println("\n=== Operator Precedence Demo ===");
        int result1 = 5 + 3 * 2;  // Multiplication first
        int result2 = (5 + 3) * 2;  // Parentheses first

        System.out.println("5 + 3 * 2 = " + result1 + " (multiplication first)");
        System.out.println("(5 + 3) * 2 = " + result2 + " (parentheses first)");

        boolean complex = 10 > 5 && 3 < 7 || 2 == 2;
        System.out.println("10 > 5 && 3 < 7 || 2 == 2 = " + complex);
    }
}