# Java Fundamentals - Day One

This repository contains foundational Java programs demonstrating core programming concepts including character literals, identifiers, primitive data types, and type conversions.

## 📁 Project Structure

```
DAY_ONE/
├── src/
│   ├── Main.java                              # Central execution point with menu-driven interface
│   ├── CharacterLiteralAndUnicode.java       # Character literals and Unicode demonstrations
│   ├── JavaIdentifierAndNamingConvention.java # Java identifiers and naming conventions
│   ├── PrimitiveDataType.java                # Primitive data types and operations
│   ├── TypeConversionAndCasting.java         # Type conversion (widening/narrowing)
│   └── DataType.java                         # Basic data type demonstrations
├── DAY_ONE.iml                               # IntelliJ IDEA module file
└── README.md                                 # This file
```

## 🚀 Features

### Main.java
- **Menu-driven interface** with comprehensive navigation
- **Exception handling** for invalid user inputs
- **Centralized execution** of all fundamental concepts
- **User-friendly interaction** with clear instructions

### CharacterLiteralAndUnicode.java
- Character literal demonstrations
- ASCII value to character conversion
- Character to integer conversion
- Unicode character support (€ symbol example)
- Escape sequence usage

### JavaIdentifierAndNamingConvention.java
- Valid identifier examples ($num1, StudentName, FOR)
- Naming convention demonstrations
- Variable declaration and initialization
- String and integer variable examples

### PrimitiveDataType.java
- Integer division operations
- Float precision calculations
- Double precision operations
- Practical examples (circle area calculation)
- Type-specific literal usage (f, d suffixes)

### TypeConversionAndCasting.java
- **Widening (Implicit) Casting**:
  - byte → int
  - float → double
- **Narrowing (Explicit) Casting**:
  - double → long
  - long → int
  - short → byte
- Data loss demonstration in narrowing
- Overflow handling examples

### DataType.java
- Complete primitive data type showcase
- Value assignment and display
- Type-specific examples for all primitives

## 🛠️ How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation and Execution

#### Using Command Line:
```bash
# Navigate to the DAY_ONE directory
cd DAY_ONE/src

# Compile all Java files
javac *.java

# Run the main program
java Main
```

#### Using IntelliJ IDEA:
1. Open the DAY_ONE project
2. Ensure JDK 23 is configured (or your preferred version)
3. Run `Main.java` as the entry point

#### Using Eclipse:
1. Import the project as existing Java project
2. Set build path to include src folder
3. Run `Main.java`

## 📚 Concepts Covered

### 1. Character Literals and Unicode
- **Character Declaration**: `char ch = 'a';`
- **ASCII Values**: `char ch1 = 65;` (outputs 'A')
- **Character to Integer**: `int name = 'A';` (outputs 65)
- **Unicode Support**: `char var1 = '\u20AC';` (€ symbol)

### 2. Java Identifiers and Naming
- **Valid Identifiers**: Starting with letters, $, or _
- **Naming Conventions**: camelCase for variables, PascalCase for classes
- **Reserved Words**: Usage of keywords as identifiers (where allowed)
- **Best Practices**: Meaningful variable names

### 3. Primitive Data Types
```java
// Integer types
byte    → 8 bits  (-128 to 127)
short   → 16 bits (-32,768 to 32,767)
int     → 32 bits (-2^31 to 2^31-1)
long    → 64 bits (-2^63 to 2^63-1)

// Floating-point types
float   → 32 bits (6-7 decimal digits)
double  → 64 bits (15-16 decimal digits)

// Other types
char    → 16 bits (Unicode characters)
boolean → true/false
```

### 4. Type Conversion and Casting

#### Widening (Implicit) Conversion:
```java
byte → short → int → long → float → double
char → int
```

#### Narrowing (Explicit) Casting:
```java
double → float → long → int → short → byte
int → char
```

## 🎯 Learning Objectives

After working with this code, you should understand:

1. **Character Handling**: How Java handles characters and Unicode
2. **Identifier Rules**: Valid naming conventions and best practices
3. **Data Types**: All primitive types and their characteristics
4. **Type Safety**: Implicit vs explicit type conversions
5. **Memory Management**: How different types consume memory

## 🔧 Interactive Examples

### Character Demonstrations
```java
char ch = 'a';           // Character literal
char ch1 = 65;           // ASCII value (outputs 'A')
int name = 'A';          // Character to integer (outputs 65)
char euro = '\u20AC';    // Unicode (outputs €)
```

### Type Conversion Examples
```java
// Widening (Safe)
byte b = 10;
int i = b;               // Automatic conversion

// Narrowing (Explicit)
double d = 10.52;
long l = (long) d;       // Manual casting required
```

### Data Type Calculations
```java
int radius = 10;
double area = 3.14 * radius * radius;  // Circle area calculation
float precision = 101f / 61f;          // Float division
```

## 📖 Example Usage

```java
// Running the program
java Main

// Sample Output:
=== Java Fundamentals Demonstration ===
Choose a demonstration to run:
1. Character Demonstration
2. Identifier Demonstration
3. Primitive Data Types Demonstration
4. Type Casting Demonstration
5. Exit
Enter your choice (1-5): 1
```

## 🚨 Important Notes

### Type Casting Warnings
- **Data Loss**: Narrowing conversion may lose data
- **Overflow**: Values exceeding range wrap around
- **Precision Loss**: Float to integer conversion loses decimal places

### Example of Data Loss:
```java
short a = 135;
byte b1 = (byte) a;      // Result: 135 (within byte range)

long l2 = 8668525992L;
int i12 = (int) l2;      // Data loss due to overflow
```

## 🎨 Code Style Guidelines

- **Variables**: camelCase (studentName, totalMarks)
- **Constants**: UPPER_CASE (MAX_VALUE, PI)
- **Classes**: PascalCase (StudentRecord, Calculator)
- **Methods**: camelCase (calculateArea, displayMenu)

## 🤝 Contributing

Contributions are welcome! Please feel free to:
- Add more examples
- Improve documentation
- Fix bugs or issues
- Suggest enhancements

## 📝 Additional Resources

- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- [Unicode Character Table](https://unicode.org/charts/)

## 🐛 Common Issues

1. **InputMismatchException**: Handle invalid user inputs
2. **Character Encoding**: Ensure proper Unicode support
3. **Type Overflow**: Be aware of data type limits
4. **Precision Loss**: Understand floating-point limitations

## 📧 Contact

**Author**: Suhas Nidgundi  
**GitHub**: [@suhasnidgundi](https://github.com/suhasnidgundi)  
**Date**: July 5, 2025

## 🏷️ Version History

- **v1.0** (July 2025): Initial release with core fundamentals
  - Character literals and Unicode support
  - Java identifiers and naming conventions
  - Primitive data types demonstrations
  - Type conversion and casting examples

---

*This project is part of the Java programming fundamentals series. Perfect for beginners learning Java basics! 🚀*

## 🔗 Related Projects

- **[Day Two](../DayTwo/README.md)**: Decision making, loops, and operators
- **[Day Three](../DayThree/README.md)**: Object-oriented programming concepts *(coming soon)*

---