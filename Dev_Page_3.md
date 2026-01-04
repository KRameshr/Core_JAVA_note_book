
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
- Private
- Protected
- Default

  🔍 Access Modifiers – Visibility Table
Modifier	Keyword	Same Class	Same Package	Subclass (Other Package)	Anywhere
Public	public	✅	✅	✅	✅
Private	private	✅	❌	❌	❌
Protected	protected	✅	✅	✅	❌
Default	(no keyword)	✅	✅	❌	❌
🧪 Access Modifier Examples
Modifier	Code Example	Typical Use Case
public	public void showService()	APIs, services, entry points
private	private long balance;	Sensitive data protection
protected	protected String accountType;	Inheritance support
default	String name;	Package-level access
