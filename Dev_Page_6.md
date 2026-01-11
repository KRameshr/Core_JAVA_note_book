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
type non-static class   member inner class


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
