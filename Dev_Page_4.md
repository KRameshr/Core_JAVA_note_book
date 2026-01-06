## table of content

- [1. Object Class](#1-object-class)
- [2. Class Class](#2-class-class)
- [3. System Class](#3-system-class)
- [4. String Class](#4-string-class)
- [5. Arrays](#5-arrays)
- [6. Boxing and Unboxing](#6-boxing-and-unboxing)
- [7. Varargs](#7-varargs)
- [8. format() and printf() Methods](#8-format-and-printf-methods)

## 1. Object Class
- Object is the root (parent) class of all Java classes.
- Every class in Java implicitly extends Object.
- Common behavior (methods) is inherited from Object.
```
class A { }
// same as
class A extends Object { }

```
# Important Methods of Object Class
Method	                Purpose
equals(Object obj)	    Logical comparison
hashCode()	            Hash value for collections
toString()	            String representation
clone()               	Creates object copy
getClass()	            Runtime class info
finalize()	           Cleanup before GC (deprecated)

1️. equals() Method
```
package Demo;

public class First {
    int val = 10;
    String info = "Hello World";

    public static void main(String[] args) {
        First obj1 = new First();
        First obj2 = new First();

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof First)) return false;

        First obj = (First) o;
        return val == obj.val && info.equals(obj.info);
    }
}
```
2️. clone() Method (with Cloneable)
- Class must implement Cloneable
- clone() is protected in Object
- Otherwise → CloneNotSupportedException
```
package Demo;

public class First implements Cloneable {
    int val;
    String info;

    public First(int val, String info) {
        this.val = val;
        this.info = info;
    }

    public static void main(String[] args) throws Exception {
        First obj1 = new First(30, "hello");
        First obj2 = (First) obj1.clone();

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof First)) return false;
        First f = (First) o;
        return val == f.val && info.equals(f.info);
    }
}
```
3️. hashCode() Method
If equals() is overridden, hashCode() must also be overridden.
```
@Override
public int hashCode() {
    int code = 1;
    code = 31 * code + val;
    code = 31 * code + (info == null ? 0 : info.hashCode());
    return code;
}
```
4️. finalize() Method ⚠️ (Deprecated)
- Called by GC before object destruction
- Not guaranteed to execute
```
@Override
protected void finalize() {
    System.out.println("inside object finalize method");
}
```
5️. getClass() Method
```
First obj = new First();
System.out.println(obj.getClass().getName());
```

## 2. Class Class

What is java.lang.Class?
- Class represents the runtime metadata of a Java class.
- A Class object is created when the JVM loads the class, not when an object is created.
- Only one Class object exists per loaded class.
- All objects of the same class share the same Class object.

How a Class Object is Created
```
.class file → ClassLoader → java.lang.Class object

Once created:
    - new ObjectDemo() → uses the same Class object
    - obj.getClass() → returns that shared object

```
Ways to Obtain a Class Object
```
    // 1. Using getClass()
    String s = "Hello";
    Class<?> c1 = s.getClass();
    
    // 2. Using .class
    Class<?> c2 = String.class;
    
    // 3. Using Class.forName()
    Class<?> c3 = Class.forName("java.lang.String");
```
Methods
public static Class forName(String className)

- Loads a class dynamically at runtime
- Used in frameworks like Spring, Hibernate, JDBC
```
Class<?> cls = Class.forName("Demo.ObjectDemo");
```
Object Creation 
```
cls.getDeclaredConstructor().newInstance();

Example 

ObjectDemo.java
package Demo;

public class ObjectDemo {
    public String info = "Reflection example";
}

📄 First.java
package Demo;

public class First {
    public static void main(String[] args) {

        String info = "Hello World";
        Class<?> testClass = info.getClass();
        System.out.println("testClass name is " + testClass.getName());

        try {
            Class<?> testClass2 = Class.forName("Demo.ObjectDemo");
            System.out.println("testClass2 name is " + testClass2.getName());

            ObjectDemo obj1 =
                (ObjectDemo) testClass2.getDeclaredConstructor().newInstance();

            System.out.println("obj1 info is " + obj1.info);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
## 3. System Class
- java.lang.System is a final class exposing utility functions
- It provides utility functions related to the system.
- Since it is in java.lang, no import is required.

All members are static, so we access them using System.

- public static final java.io.PrintStream out;
- public static final java.io.PrintStream err;
- Public static final java.io.InputStream in;
- public static long currentTimeMillis();
- public static Sring getProperty(String propName);

example
```
package Demo;

public class First {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("Hello, World!");
        System.out.print("This is my first Java program.");
        System.err.println(" Let's learn Java together!");
        System.err.println(getTestUserInpput());

       long nstartTime = System.currentTimeMillis();
       System.out.println("inital time: "+ startTime );
       System.out.println("after  time: "+ nstartTime );
       System.out.println("final time: "+ ( nstartTime -startTime));

       System.out.println(System.getProperty("os.name"));
       System.out.println(System.getProperty("user.name"));
       System.out.println(System.getProperty("java.version"));
    }

    public static String getTestUserInpput(){
        StringBuffer sb = new StringBuffer();
        try{
            char c = (char)System.in.read();
            while(c != '\r'){
                sb.append(c);
                c = (char)System.in.read();
            }
            System.out.println(c);

        }catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }


}
   
```

## 4. String Class

- java.lang.String represents text (a sequence of characters).
- It is immutable (cannot be changed once created).
- Because it is immutable, it is thread-safe.
        Once a String object is created, its value cannot be changed. Any modification creates a new String object.
- Java uses String Pooling to save memory.
     Java stores String literals in a special memory area called String Pool. If the same value exists, Java reuses the object instead of creating a new one.
- Some methods
  - public int length()
  - public String subString(int beginIndex)
  - public String[] split (String regex)

example 
```
package Demo;

public class First {
    public static void main(String[] args) {
        String message = "Hello, World!";
        String additional = "Hello, World";

        System.out.println(message.length());
        System.out.println(additional.length());
        System.out.println(additional.substring(1,2));
        String[] s = message.split(" ");
        for(String str : s){
            System.out.println("str is :- "+str);
        }

        Runtime runtime = Runtime.getRuntime();
        System.gc();
        System.out.println("Total Memory: "+ runtime.totalMemory());//check JMV memory 
        System.out.println("Total Memory before starting is: "+ (runtime.totalMemory())/(1024*1024));
        System.out.println("Free Memory before starting is: "+ (runtime.freeMemory())/(1024*1024));
        System.out.println("Use Memory before starting is: "+ ((runtime.totalMemory()-runtime.freeMemory()))/(1024*1024));

        for(int i=0; i<100000; i++){
             message = message + additional;
        }
        System.out.println("Total Memory before finishing is: "+ (runtime.totalMemory())/(1024*1024));
        System.out.println("Free Memory before finishing is: "+ (runtime.freeMemory())/(1024*1024));
        System.out.println("Use Memory before finishing is: "+ ((runtime.totalMemory()-runtime.freeMemory()))/(1024*1024));
        System.gc();
        String combined = new String("Hello, World!");
        if(message == additional ){
            System.out.println("Both strings are the same.");
        } else if(message == combined) {
            System.out.println("Strings are different.");
        }else {
            System.out.println("Strings are different.");
        }
    }
}
```

 String Classes : StringBuffer
 - java.lang.StringBuffer is used for string manipulation.
 - It is mutable, unlike java.lang.String.
 - It is thread-safe, hence little expensive to work with.

 String Classes : StringBuilder
  - java.lang.StringBuilder is used for string manipulation.
  - It is also mutable, like java.lang.StringBuffer.
  - It is not thread-safe, hence useful where we don’t need shared resources.
 Some methods are :-
  - public int capacity()
  - public StringBuilder append(String args)
  - public StringBuilder insert (int offset, String args)

example
```
package Demo;

 public class First {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
    
      
        System.out.println(str1.length());
        System.out.println(str1.capacity());
        System.out.println(str1);


        Runtime runtime = Runtime.getRuntime();
        System.gc();
        System.out.println("Total Memory: "+ runtime.totalMemory());//check JMV memory 
        System.out.println("Total Memory before starting is: "+ (runtime.totalMemory())/(1024*1024));
        System.out.println("Free Memory before starting is: "+ (runtime.freeMemory())/(1024*1024));
        System.out.println("Use Memory before starting is: "+ ((runtime.totalMemory()-runtime.freeMemory()))/(1024*1024));

        for(int i=0; i<5000; i++){
             str1.append("Today");
        }
        System.out.println("Total Memory before finishing is: "+ (runtime.totalMemory())/(1024*1024));
        System.out.println("Free Memory before finishing is: "+ (runtime.freeMemory())/(1024*1024));
        System.out.println("Use Memory before finishing is: "+ ((runtime.totalMemory()-runtime.freeMemory()))/(1024*1024));
        System.gc();
    }
 }    
```
## 5. Arrays
- An array is a Java object used to store multiple values together.
- It can store primitives (int, char) or objects (String).
- All elements must be of the same type.
- Array size is fixed once created.

- Useful Methods
   copyOf()
```
    public static int[] copyOf(int[] original, int newLength)
```
  Creates a new array with the given length.

    copyOfRange()
```
    public static int[] copyOfRange(int[] original, int from, int to)

     Copies elements from index from to to-1.

     example 

     

 package Demo;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] intArray ;
        intArray = new int[]{2,3,5,7,11};
        for(int i : intArray){
           // System.out.println(i);
        }
        int[][] twoDArray = new int[3][];
        twoDArray[0] = new int[]{1,2};
        twoDArray[1] = new int[]{3,4,5};
        //  for (int[] i : twoDArray) {
        //     for (int j : i) {
        //         System.out.println(" " + j);
        //     }
        //     System.out.println(" ");
        // }
        intArray = Arrays.copyOf(intArray, 2);
        for(int j : intArray){
            System.out.println(j);
        }

        intArray = Arrays.copyOfRange(intArray, 2,5);
        for(int i : intArray){
            System.out.println(i);
        }
    
    }
 }

``` 

## 6. Boxing and Unboxing
## 7. Varargs
## 8. format() and printf() Methods
