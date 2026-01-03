Markdown

# Core Java Statements

This repository contains notes and examples regarding Java Control Flow Statements.

## 📚 Table of Contents
- [1. If Statement](#1-if-statement)
- [2. While Statement](#2-while-statement)
- [3. Do-while Statement](#3-do-while-statement)
- [4. For Statement](#4-for-statement)
- [5. Break Statement](#5-break-statement)
- [6. Continue Statement](#6-continue-statement)
- [7. Switch Statement](#7-switch-statement)

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

The syntax for the do-while statement is as follows:
```
Java

do {
    statement(s)
} while (booleanExpression);

```
### 4. For Statement
The for statement uses the following syntax:

Java
```
for (init; booleanExpression; update)
{
    statement (s)
}
```

### 5. Break Statement

Usage: The Break Statement is used to break out of an enclosing for, while, do, or switch statement.
Restriction: It cannot be used elsewhere, or it will result in a compilation error.
```
Example:
Java

for (int i=0; i<10; i++) {
    if (j==6) {
        break;
    }
    System.out.println(i);
}
```

### 6. Continue Statement

Usage: The Continue Statement is similar to Break, but it only stops the execution of the current statement/iteration and causes control to return to the next iteration.
```
Example:
Java

for (int i=0; i<10; i++) {
    // Check condition
    if (j==6) {
        continue;
    }
    System.out.println(i); 
}

```
### 7. Switch Statement
The syntax for the switch statement is as follows:
```
Java

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
```
