- [1. Nested](#1-nested)

#### 1. Nested

 A class defined within a class or interface is known as a nested class.

````
Syntax:
Java
class Java_Outer_class {
    // code 
    class Java_Inner_class {
        // code  
    }
}

Example

package Demo;
public class First  {
    class NestedClass{
        void PrintInnerMethod(){
            System.out.println("Reached in the nested class");
        }
    }
    public static void main(String[] args)  {
     First.NestedClass n = new First().new NestedClass();
     n.PrintInnerMethod();
    }   
}
````

##### Types of Nested Classes
Nested classes are divided into two main categories: Static Nested Classes and Non-static Nested Classes (also known as Inner Classes).

##### Non-static Nested Classes (Inner Classes):
- Member Inner Class: A non-static class created inside a class but outside a method.
````
  package Demo;
public class First  {
    
    public static void main(String[] args)  {
     OuterClass o = new OuterClass();
     OuterClass.Inner i = o.new Inner();
     i.printStr();
    }   
}

class OuterClass{
    private String str  = "Outer String";
        class Inner {
            String str  = "Inner String";
            void printStr(){
                System.out.println("Reached in the nested class " + str);
                System.out.println("Reached in the nested class " +OuterClass.this.str);
            }
        }       
}

````

##### Local Inner Class: Classes defined inside a method or a scope block.
  
````
  package Demo;

public class First {

    static void test() {
        class LocalInner {
            private String str = "Local inner String";

            void printStr() {
                System.out.println("The String value is " + str);
            }
        }

        LocalInner i = new LocalInner();
        i.printStr();
    }

    public static void main(String[] args) {
        test();
    }
}
````
##### Anonymous Inner Class: A class that has no name; it is used to override methods of a class or interface.

 ````
package Demo;

public class First {
    public static void main(String[] args) {

        AbsClass a = new AbsClass() {
            void printStr() {
                System.out.println("Hello I am AbsClass");
            }
        };

        a.printStr();


        InnerFirst i = new InnerFirst() {
            @Override
            public void PrintInnerstr() {
                System.out.println("Hello I am Interface");
            }
        };

        i.PrintInnerstr();


    }
}

abstract class AbsClass {
    abstract void printStr();
}

 interface InnerFirst {
    void PrintInnerstr(); 
}
````

##### Static Nested Class: A static class created inside another class
    
    - Definition: A static class created inside another class.
    - Constraints: It cannot access non-static data members or methods.
    - Access: It can be accessed using the outer class name.

Java
````
class Outer {
    static class inner { }
}
````

example

````

package Demo;

public class First {
    public static void main(String[] args) {
        staticOuter.StaticNested.printStr();       
    }
}

class staticOuter {
    static String str = "Static Outer";
    static class StaticNested {
        static void printStr(){
            System.out.println("Inside the nested class "+str);
        }
    }

}
````

