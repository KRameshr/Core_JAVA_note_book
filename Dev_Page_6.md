- [1. Nested](#1-nested)
- [2. Thread](#2-thread)

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

#### 2. Thread

 - Defining Thread

````
Extend class java.lang.Thread & Override run method
E.g.:-
class ThreadDemo extends Thread {
   public void run() {
   //your code
   }
}
 Implement java.lang.Runnable interface
E.g. class ThreadDemo implements Runnable {
 public void run() {
   //your code
 }
}


Example 
package Demo;

public class Progarmmin {
    public static void main(String[] args) {
        ThreadExtendClass t1 = new ThreadExtendClass();
        t1.setName("FisrtThread");
        t1.start();

        ThreadExtendClass t2 = new ThreadExtendClass();
        t2.setName("SecondThread");
        t2.start();

        ThreadExtendClass t3 = new ThreadExtendClass();
        t3.setName("ThirdThread");
        t3.start();

        ThreadImplementRunnableClass obj = new ThreadImplementRunnableClass();
        Thread t4 =new  Thread(obj);
        t4.start();
       
    }
    
}

class ThreadExtendClass extends Thread {
    public void run() {
        for(int i =0; i<5; i++){
         System.out.println("Thread Extend example and Thread is: "+i+ " "+Thread.currentThread().getName() );
        }
    }
}

class ThreadImplementRunnableClass implements Runnable {
    public void run() {
        System.out.println("Thread Implement example");
    }
}
````
 - Creating & Starting a Thread

````
When the class extends java.lang.Thread class
E.g.:- ThreadDemo t = new ThreadDemo();
t.start();
Ø When the class implements java.lang.Runnable interface
E.g. ThreadDemo obj = new ThreadDemo();
Thread t = new Thread(obj);
t.start();

````
 - Thread States

One of the following five states:-
##### New:- This is the state the thread is in after the Thread instance
has been created, but the start() method has not been invoked on
the thread.
##### Runnable:- This is the state a thread is in when it's eligible to
run, but the scheduler has not selected it to be the running
thread. A thread first enters the runnable state when the start()
method is invoked.
##### Running:- When the scheduler chooses the thread to be running
as the current process.
Waiting/Blocked/Sleeping:- This is the state where the thread
is still alive but not eligible to run.
##### Dead:- This is the state when the run method of the Thread has
completed its execution and it no longer remains a separate
thread of execution.
 - Preventing Thread Execution
       
       Three scenario would be discussed :-
       - Thread is sleeping.
       -  Thread is waiting.
       -   hread is blocked for acquiring an object’s lock.
 - Thread Sleeping

Sleep

   Makes the running thread go into the sleep state for some specified time
   
Yield

   Makes the current running thread give up the processor temporarily, but keeps the thread in runnable state.
   
Join

   Makes the current thread wait for the end of execution of the thread it is joined to.

exmple 
````
package Demo;

public class Progarmmin {
    public static void main(String[] args) {
        ThreadExtendClass t1 = new ThreadExtendClass();
        t1.setName("FisrtThread");
        t1.start();

        ThreadExtendClass t2 = new ThreadExtendClass();
        t2.setName("SecondThread");
        t2.start();

        ThreadExtendClass t3 = new ThreadExtendClass();
        t3.setName("ThirdThread");
        t3.start();

       
    }
    
}

class ThreadExtendClass extends Thread {
    public void run() {
        
        //type  sleep 

        try {
            for(int i =0; i<5; i++){
                System.out.println("Thread Extend example and Thread is: "+i+ " "+Thread.currentThread().getName() );
                Thread.currentThread().sleep(3000);
            }

        }catch(InterruptedException ie){
            System.out.println(ie);
        }
       
    }
}

class ThreadImplementRunnableClass implements Runnable {
    public void run() {
        System.out.println("Thread Implement example");
    }
}
````



 - Thread priorities

 Any number from 1 to 10
- Uses the Thread class’ static method “setPriority(int val)"
- Three static final variables hold these values:-
- Thread.MIN_PRIORITY (1)
- Thread.NORM_PRIORITY (5)
-  Thread.MAX_PRIORITY (10)


````

package Demo;

public class Progarmmin {
    public static void main(String[] args) {
        ThreadExtendClass t1 = new ThreadExtendClass();
        t1.setName("FisrtThread");
        t1.setPriority(5);
        t1.start();

        ThreadExtendClass t2 = new ThreadExtendClass();
        t2.setName("SecondThread");
        t2.setPriority(10);
        t2.start();
        try {
            t1.start();
            t1.join();
            t2.start();
        } catch(InterruptedException ie){
            System.out.println(ie);
         }
       
    }
    
}

class ThreadExtendClass extends Thread {
    public void run() {
        

        try {
            for(int i =0; i<3; i++){
                System.out.println("Thread Extend example and Thread is: "+i+ " "+Thread.currentThread().getName() );
                if(i == 1 && "SecondThread".equals(Thread.currentThread().getName()))
                Thread.currentThread().yield();
            }

        }catch(Exception ie){
            System.out.println(ie);
        }
       
    }
}

class ThreadImplementRunnableClass implements Runnable {
    public void run() {
        System.out.println("Thread Implement example");
    }
}

````

 - Synchronization
 - Thread Interaction
