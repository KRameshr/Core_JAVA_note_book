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
# Ways to Obtain a Class Object
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
# public static Class forName(String className)

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
## 4. String Class
## 5. Arrays
## 6. Boxing and Unboxing
## 7. Varargs
## 8. format() and printf() Methods
