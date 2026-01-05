
##  Table of Contents
- [1. If Statement](#1-if-statement)
- [2. While Statement](#2-while-statement)
- [3. Do-while Statement](#3-do-while-statement)
- [4. For Statement](#4-for-statement)
- [5. Break Statement](#5-break-statement)
- [6. Continue Statement](#6-continue-statement)
- [7. Switch Statement](#7-switch-statement)
- [8. Java Objects and Classes](#8-java-objects-and-classes)
- [9. Encapsulation and Access Control](#9-encapsulation-and-access-control)
- [10. The this Keyword](#10-the-this-keyword)
- [11. Static Members](#11-static-members)
- [12. Method Overloading](#12-method-overloading)
- [13. Pass by Value vs By Reference](#13-pass-by-value-vs-by-reference)
- [14. Loading, Linking, and Initialization](#14-loading-linking-and-initialization)
- [15. Comparing Objects](#15-comparing-objects)
- [16. The Garbage Collector](#16-the-garbage-collector)

---

### 1. If Statement
An if statement in Java is a decision-making (conditional) statement used to execute a block of code only when a given condition is true.

```
Option A: If
if (booleanExpression)
{
    statement(s)
}

Option B: If-Else

if (booleanExpression)
{
    statement(s)
}
else
{
    statement(s)
}
example

String orderStatus = "PAID";

if (orderStatus.equals("NEW")) {
    System.out.println("Order received and pending payment.");
} else if (orderStatus.equals("PAID")) {
    System.out.println("Payment confirmed. Preparing shipment.");
} else if (orderStatus.equals("SHIPPED")) {
    System.out.println("Order shipped to customer.");
} else {
    System.out.println("Invalid order status.");
}

```

### 2. While Statement

defination  :- A while statement in Java is a looping control statement used to repeatedly execute a block of code as long as a given boolean condition remains true.

Syntax 
```
while (booleanExpression)
{
    statement(s)
}
Example
    int maxAttempts = 3;
    int attemptCount = 0;
    boolean isAuthenticated = false;
    
    while (attemptCount < maxAttempts && !isAuthenticated) {
        System.out.println("Attempting user login...");
    
        isAuthenticated = true; // assume login success
    
        attemptCount++;
    }
    
    if (isAuthenticated) {
        System.out.println("User logged in successfully.");
    } else {
        System.out.println("Account locked due to multiple failed attempts.");
    }

```
### 3. Do-while Statement

A do-while statement in Java is a looping control statement used to execute a block of code at least once, and then repeatedly execute it as long as a given boolean condition remains true.
```
Syntax

do {
    statement(s)
} while (booleanExpression);

Example
int userChoice;

do {
    System.out.println("===== Application Menu =====");
    System.out.println("1. View Profile");
    System.out.println("2. Update Profile");
    System.out.println("3. Logout");

    // Simulating user input
    userChoice = 3;

    System.out.println("User selected option: " + userChoice);

} while (userChoice != 3);

System.out.println("User logged out successfully.");


```
### 4. For Statement
A for statement in Java is a looping control statement used to execute a block of code a specific number of times.

Syntax
```
for (init; booleanExpression; update)
{
    statement (s)
}

Example
int totalEmployees = 5;

for (int employeeId = 1; employeeId <= totalEmployees; employeeId++) {
    System.out.println("Processing employee record ID: " + employeeId);
}


int[] orders = {101, 102, 103, 104, 105};

for (int i = 0; i < orders.length; i++) {
    int orderId = orders[i];
    int digitLength = String.valueOf(orderId).length();

    System.out.println(
        "Processing order ID: " + orderId +
        " | Digit length: " + digitLength
    );
}

```

### 5. Break Statement

The break statement is used to immediately terminate the execution of an enclosing loop or switch statement.
After break is executed, program control moves to the statement following the loop or switch.

```
Syntax
for (int i=0; i<10; i++) {
    if (j==6) {
        break;
    }
    System.out.println(i);
}
Example:

int[] orderIds = {101, 102, 103, 104, 105};
int targetOrderId = 103;

for (int i = 0; i < orderIds.length; i++) {

    if (orderIds[i] == targetOrderId) {
        System.out.println("Target order found: " + targetOrderId);
        break; // stop further processing
    }

    System.out.println("Checking order ID: " + orderIds[i]);
}

```

### 6. Continue Statement

Defnation: The continue statement is used to skip the remaining code of the current loop iteration and immediately move to the next iteration of the loop.
```
Syntax
for (int i = 0; i < n; i++) {
    if (condition) {
        continue;
    }
    // statements
}

Example:
int[] orderIds = {101, 0, 102, -1, 103};

for (int i = 0; i < orderIds.length; i++) {

    // Skip invalid order IDs
    if (orderIds[i] <= 0) {
        continue;
    }

    System.out.println("Processing order ID: " + orderIds[i]);
}

```
### 7. Switch Statement
A switch statement in Java is a multi-branch decision-making statement used to execute one block of code from multiple options, based on the value of a single expression.
```
Syntax
switch (expression)
{
    case Value_1:
        statement(s);
        break;
    case value_2:
        statement(s);
        break;
    case value_n:
        statement(s);
        break;
    default:
        statement(s);
}


Example

String orderStatus = "PAID";

switch (orderStatus) {
    case "NEW":
        System.out.println("Order received and pending payment.");
        break;

    case "PAID":
        System.out.println("Payment confirmed. Preparing shipment.");
        break;

    case "SHIPPED":
        System.out.println("Order shipped to customer.");
        break;

    default:
        System.out.println("Invalid order status.");
}
```

### 8. Java Objects and Classes
 # What are Java Objects and Classes?
 In Java, classes and objects are the core building blocks of Object-Oriented Programming (OOP).
     A class is a blueprint or template
     An object is a real instance of a class
     
 ➤ What is a Java Object?
 
    A Java object is a runtime instance of a class.
    It represents a real-world entity and contains:
```
    State → stored in fields (attributes)
    Behavior → defined by methods
```
➤ Creating an Object in Java

Objects are created using the new keyword, which:
```
    - Allocates memory
    - Calls the constructor
    - Returns a reference to the object    
```

➤ What is a Java Class?

A Java class is a user-defined data type that groups:

- Fields (data)
- Methods (behavior)
- Constructors (object initialization)

```
Example
public class First {

    String accountNumber;
    String accountType;
    long amount;

    // Withdraw money
    public boolean withdrawAmount(long amt) {
        if (amt > amount) {
            return false;
        } else {
            amount = amount - amt;
            return true;
        }
    }

    // Deposit money
    public boolean depositAmount(long amt) {
        if (amt <= 0) {
            return false;
        } else {
            amount = amount + amt;
            return true;
        }
    }

    public static void main(String[] args) {

        First testObj = new First();

        testObj.accountNumber = "1234567890";
        testObj.accountType = "Savings";
        testObj.amount = 5000;

        System.out.println(
            "Initial Amount: " + testObj.amount +
            "\nWithdrawing 20000: " + testObj.withdrawAmount(20000)
        );

        System.out.println(
            "Amount After Withdrawal: " + testObj.amount +
            "\nDepositing 20000: " + testObj.depositAmount(20000)
        );

        System.out.println("Final Amount: " + testObj.amount);
    }
}

```
➤ Fields (Attributes)

Fields are variables declared inside a class but outside methods.
They store the state of an object.

```
Example
    String accountNumber;
    String accounType;
    long amount;
```
➤ Methods

Methods define the behavior of an object.
They contain logic to operate on fields.
```
Example
public boolean depositAmount(long amt){
        if(amt < 0){
            return false;
        } else{
            amount = amount + amt;
            return true;
        }
        
    }
```
➤ The main Method

The main method is the entry point of a Java application.
```
Syntax
public static void main(String[] args)

Example
public static void main(String[] args) {
    System.out.println("Program started");
}
```

➤ Constructors

A constructor is a special method used to initialize objects.

Characteristics
- Same name as class
- No return type
- Called automatically when an object is created
```
Example
public class First {

    String accountNumber;
    String accountType;
    long amount;

    // Default constructor
    public First() {
        System.out.println("Called default constructor");
    }

    // Parameterized constructor
    public First(String accountNumber, String accountType, long amount) {
        System.out.println("Called parameterized constructor");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.amount = amount;
    }

    // Withdraw method
    public boolean withdrawAmount(long amt) {
        if (amt > amount) {
            return false;
        } else {
            amount = amount - amt;
            return true;
        }
    }

    // Deposit method
    public boolean depositAmount(long amt) {
        if (amt <= 0) {
            return false;
        } else {
            amount = amount + amt;
            return true;
        }
    }

    public static void main(String[] args) {

        First testObj = new First("1234567890", "Savings", 10000);

        System.out.println(
                "Initial Amount: " + testObj.amount +
                "\nWithdrawing 2000: " + testObj.withdrawAmount(2000)
        );

        System.out.println(
                "Amount After Withdrawal: " + testObj.amount +
                "\nDepositing 20000: " + testObj.depositAmount(20000)
        );

        System.out.println("Final Amount: " + testObj.amount);
    }
}

```


### 9. Encapsulation and Access Control

Encapsulation is the process of wrapping data (variables) and methods (code) together into a single unit (class) and restricting direct access to the data.

It is achieved using:
    - Access control modifiers
    - Getters and setters
    
Access Control Modifiers
- Public
       Accessible everywhere. APIs, services, entry points
       - public / public void showService()     
- Private
       Accessible only within the class. Protects sensitive data
      - private / private long balance;  
- Protected
      Accessible in the same package and subclasses. Supports inheritance
       - protected / protected String accountType; 
- Default
       Accessible only within the same package. Package-level access
       - (no keyword) / String name;

### 10. The this Keyword

Definition:

The this keyword in Java refers to the current object of a class. It is commonly used to:
- Distinguish class fields from method or constructor parameters
- Pass the current object as a parameter
- Call other constructors from a constructor (constructor chaining

  Exa
  ```
      public class BankAccount {
    
        private String accountNumber;
        private String accountType;
        private double balance;
    
        // Constructor
        public BankAccount(String accountNumber, String accountType, double balance) {
            // 'this' differentiates class fields from parameters
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.balance = balance;
        }
    
        // Method to deposit money
        public void deposit(double balance) {
            // 'this.balance' refers to the class field
            this.balance += balance;
            System.out.println("Deposited: " + balance + ", New Balance: " + this.balance);
        }
    
        // Method to display account details
        public void displayAccount() {
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Account Type: " + this.accountType);
            System.out.println("Balance: " + this.balance);
        }
    
        public static void main(String[] args) {
            BankAccount account = new BankAccount("123456", "Savings", 5000);
    
            account.deposit(2000);  // Depositing money
            account.displayAccount(); // Display account info
        }
    }
   ```


### 11. Static Members


1.Class-level members
    - Static members belong to the class, not to individual objects.
    - There’s only one copy of a static member shared across all instances of the class.
2. No object needed
  - You can access a static variable or method without creating an object.
  - Syntax:
   ```
        ClassName.staticMember
        
     ```      
        Example:
      ```     
        class Calculator {
            static int count = 0; // static variable
        
            static void displayCount() { // static method
                System.out.println("Count: " + count);
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                Calculator.displayCount(); // Accessing without object
                Calculator.count = 5;      // Direct access to static variable
            }
        }
   ```
3. Distinguish from local variables
  - Local variables exist inside methods and are created fresh each time the method runs.
  - Static variables exist once at the class level, so they retain values across method calls and objects.

Example
   ```
package demo;

/**
 * Demonstrates the use of static and instance members in Java.
 */
public class Circle {

    // Static variable - shared across all objects
    private static final double PI;

    // Instance variable - each object has its own copy
    private int radius;

    // Static block - runs once when the class is loaded
    static {
        System.out.println("Static block executed: Initializing PI");
        PI = 3.141592653589793;
    }

    /**
     * Constructor to initialize radius
     *
     * @param radius radius of the circle
     */
    public Circle(int radius) {
        this.radius = radius;
        System.out.println("Constructor executed for radius: " + radius);
    }

    /**
     * Static method to get the value of PI
     *
     * @return value of PI
     */
    public static double getPi() {
        return PI;
    }

    /**
     * Instance method to calculate the area of the circle
     *
     * @return area of the circle
     */
    public double calculateArea() {
        return PI * radius * radius;
    }

    /**
     * Getter for radius
     *
     * @return radius of the circle
     */
    public int getRadius() {
        return radius;
    }

    public static void main(String[] args) {

        // Create Circle objects
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);

        // Access static member via class
        System.out.println("Static variable PI: " + Circle.getPi());

        // Access instance members via objects
        System.out.println("Circle1 radius: " + circle1.getRadius() + ", Area: " + circle1.calculateArea());
        System.out.println("Circle2 radius: " + circle2.getRadius() + ", Area: " + circle2.calculateArea());

        // Static method access
        System.out.println("Access PI using static method: " + Circle.getPi());
    }
}

   ```

### 12. Method Overloading

Definition:
Method overloading occurs when a class has multiple methods with the same name but different parameter lists (different type, number, or both).

Key Points:
- The method name must be the same.
- Parameters must differ (number or type).
- Return type can be same or different, but return type alone cannot distinguish overloaded methods.
- Overloading allows similar operations to be performed with different types of input.

example
  ```
package demo;

/**
 * Demonstrates constructor and method overloading for Triangle area calculation.
 */
public class Triangle {

    // Instance variables
    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;

    // Constructor for base-height triangle
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // Constructor for triangle using 3 sides
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate area using base and height
    public double getArea() {
        if (base > 0 && height > 0) {
            return 0.5 * base * height;  // Triangle area formula
        } else {
            // Use Heron's formula if sides are set
            double s = (side1 + side2 + side3) / 2.0;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }

    public static void main(String[] args) {
        // Base-height triangle
        Triangle t1 = new Triangle(10, 20);
        System.out.println("Area of triangle (base-height): " + t1.getArea());

        // Triangle with 3 sides
        Triangle t2 = new Triangle(3, 4, 5);
        System.out.println("Area of triangle (3 sides): " + t2.getArea());
    }
}

  ```
### 13. Pass by Value vs By Reference
- Primitive variables are passed by value in a method and their values don’t change in calling method.
- Changes in the reference variables which are done in the called method, are also seen by the calling method.

 ```
package Demo;

// Helper class for reference example
class TestRef {
    int val;
}

public class First {

    // Primitive variable example
    public static void changeVariable(int a) {
        a = a + 10;
        System.out.println("Inside primitive method: " + a);
    }

    // Reference variable example
    public static void changeVariable(TestRef obj) {
        obj.val = 10;
        System.out.println("Inside reference method: " + obj.val);
    }

    public static void main(String[] args) {

        // Primitive case
        int a = 5;
        System.out.println("Before primitive method: " + a);
        changeVariable(a);
        System.out.println("After primitive method: " + a);

        System.out.println("--------------------------------");

        // Reference case
        TestRef ref = new TestRef();
        ref.val = 5;
        System.out.println("Before reference method: " + ref.val);
        changeVariable(ref);
        System.out.println("After reference method: " + ref.val);
    }
}
 ```
### 14. Loading, Linking, and Initialization
