## Core Java – Introduction

Java continues to be one of the most influential programming languages in the world. Known for its <br/>
robustness, platform independence, and vast ecosystem, Java powers everything from mobile apps to   <br/>
massive enterprise systems.

This article provides a crisp introduction to the language—its origins, purpose, components, features, and evolution.

#  Overview & Agenda
- About Java
- What is Java?
- Why Java was created
- JVM, JRE, JDK explained
- How Java achieves platform independence
- Key features of Java
- Evolution of Java versions

# 1. About Java

Java has remained one of the most popular programming languages since 1996. <br/>
With more than 10 million developers worldwide, Java is used in:

- Mobile applications  
- Desktop applications  
- Embedded systems  
- Cloud-based enterprise applications  
- Big data & distributed systems  

Its versatility and reliability make it suitable for projects of all scales—from tiny devices to massive corporate solutions.

# 2. What is Java?

Java was originally developed by Sun Microsystems in 1996 as a high-level, object-oriented programming language. <br/>
Today, Java is more than just a language — it is also:
- ✔ A platform
- ✔ A development environment
- ✔ A runtime environment


This combination is what makes Java a comprehensive ecosystem for building modern applications.

# 3. Why Was Java Created?
During the mid-90s, the industry needed a language that could run on multiple devices without requiring major changes. <br/>

Although C++ was powerful and widely used, it was:
 - Resource-intensive
 - Platform-dependent
 - Not ideal for building portable applications

So Java was designed with a game-changing philosophy:

# “Write Once, Run Anywhere (WORA)”

This enabled developers to write code once and run it on any system with a compatible #JVM.

# 4. How Does Java Achieve Platform Independence?
🔸 Traditional Programming Model
```
 Source Code → Native Machine Code
```

This binds programs to a specific operating system.

🔹 Java Programming Model
```
Source Code → Bytecode → JVM Execution
```

The compiler converts Java code into a platform-neutral bytecode, which is executed by the Java Virtual Machine (JVM).

# Internal Execution Flow

- Java program generates a .class file (bytecode)
- Class Loader loads the class
- Bytecode Verifier checks for security and correctness
- Interpreter / JIT Compiler processes bytecode
- Execution Engine executes the instructions
- Interacts with the underlying system hardware

This layered structure ensures both security and portability.

# 5. JVM, JRE, and JDK Explained
🔸 JVM (Java Virtual Machine)
 - Executes Java bytecode
 - Provides platform independence
  - Core of the Java runtime environment

🔸 JRE (Java Runtime Environment)
- Contains JVM + essential Java libraries
- Required to run Java applications

🔸 JDK (Java Development Kit)
- Contains JRE + compiler (javac) + development tools
- Required to develop Java applications

 # Key Features of Java

- Platform Independent
- Compiled & Interpreted
- Object-Oriented
- Simple & Easy to Learn
- Robust & Secure
- Dynamic & Extensible

Java’s design ensures reliability, maintainability, and high performance across all environments.

# Evolution of Java Versions
Version	Release Date
```
JDK 1.0	January 23, 1996
JDK 1.1	February 19, 1997
J2SE 1.2	December 8, 1998
J2SE 1.3	May 8, 2000
J2SE 1.4	February 6, 2002
J2SE 5.0	September 30, 2004
Java SE 6	December 11, 2006
Java SE 7	July 7, 2011
Java SE 8	March 18, 2014
```
Each version introduced new enhancements, libraries, and performance upgrades—especially Java 8, which revolutionized Java with streams, lambdas, and functional programming.


📝 Overview

Environment Setup

First Java Program

<br/>
🛠️ Environment Setup
Download JDK

Download the Java Platform (JDK) from:
https://www.oracle.com/technetwork/java/javase/downloads/index.html

Install the JDK on your machine.
<br/>

Download NetBeans IDE

Download NetBeans IDE from:
https://www.oracle.com/technetwork/java/javase/downloads/index.html

Install NetBeans IDE and set the installed JDK location as the default JDK for the IDE.
<br/>

✔ Other Available IDEs

Eclipse (free and open source)

Sun's Java Studio Enterprise (free)

Sun's Java Studio Creator (free)

Oracle JDeveloper (free)

Borland JBuilder

IBM WebSphere Studio Application Developer

BEA WebLogic Workshop

IntelliJ IDEA

<br/>
🚀 First Java Program

Below is your first sample Java program:

package myPackage;
/**
* @author testuser
*/
public class FirstApp {
    public static void main(String[] args) {
        System.out.println("Hello Beans!!");
    }
}

<br/>
📌 Contents of the Java Program
🔹 Package
Code:
package myPackage;

Explanation:

Specifies the package for the program.

FirstApp.java gets compiled and FirstApp.class is stored inside the myPackage folder.

🔹 Comments
Code:
/**
* @author testuser
*/

Explanation:

Single-line comments: // comment

Multi-line comments: /* comment */

🔹 Reserved Words
Explanation:

Reserved words (keywords) have predefined meanings and cannot be used as identifiers.

Examples:
class, public, static, etc.

🔹 Statements
Explanation:

A statement represents an action or set of actions.

Example:
System.out.println("Hello Beans!!");


Every Java statement ends with a semicolon (;).

🔹 Blocks
Explanation:

A block is defined using { } and groups multiple statements.

Example:
public static void main(String[] args) {
    System.out.println("Hello Beans!!");
}

🔹 Class
Explanation:

A class represents the blueprint for creating objects.

Example:
public class FirstApp {

🔹 Methods
Explanation:

Methods perform specific operations and may take inputs and return outputs.

Example:
System.out.println("Hello Beans!!");

🔹 Main Method
Explanation:

Entry point of any Java program

Accepts a String[] as input

Example:
public static void main(String[] args) {
    System.out.println("Hello Beans!!");
}

