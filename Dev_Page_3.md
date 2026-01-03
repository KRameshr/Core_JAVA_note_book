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

## 1. If Statement
[cite_start]The syntax of the `if` statement can be one of the following two forms[cite: 7, 17]:

### Option A: Simple If
```java
if (booleanExpression)
{
    statement(s)
}


 Option B: If-Else
Java

if (booleanExpression)
{
    statement(s)
}
else
{
    statement(s)
}
```

### 2. While Statement

defination  :- 

Syntax 
```
while (booleanExpression)
{
    statement(s)
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
