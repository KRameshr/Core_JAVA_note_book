- [1. Nested](#1-nested)

#### 1. Nested
 A class defined within a class or interface is known as a nested class.
 
Example Syntax:

Java

class Java_Outer_class {

    // code
    
    class Java_Inner_class {
    
        // code
        
    }
    
}
````

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
