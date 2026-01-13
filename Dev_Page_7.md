###### What is Collections Framework?

Collections Framework consists of set of interfaces and utility classes used for storing, searching and arranging objects.

Benefits of using this framework are that users don’t have to worry about the number of objects they store, along with availability of number of APIs and Interfaces for easy searching.


- Key interfaces of Collections Framework
````
   Lists : Store list of objects.
   Sets: Store unique objects.
   Maps : Store objects with unique keys.
   Queues: Store objects in an order, in which they should be processed.
````
###### Comparable & Comparator

  - java.lang.Comparable is an interface that objects need to implement in case they want to get sorted by Collections class’ sort method.
  - For implementing comparable interface, the objects need to override the compareTo(Object o) method.
  - This returns 0 if passed object is equal, -1 if passed object is greater and 1 if passed object is lesser.
  - java.util.Comparator is required, when custom criteria is used for sorting, e.g. sort employee object with name or id or salary or DOJ etc.

    
- Lists

````
package Demo;

import java.util.LinkedList;

public class ArrayList {
     public static void main(String[] args) {
        StackDemo ob = new StackDemo();
        ob.push("Obj1");
        ob.push("Obj2");

        System.out.println("Stack: " + ob.l1);

        System.out.println("Popped: " + ob.pop());
        System.out.println("Stack after pop: " + ob.l1);

     }
}



class StackDemo {
    LinkedList<String> l1 = new LinkedList<>();

    public void push(String o) {
        l1.addFirst(o);
    }

    public String pop() {
        return l1.removeFirst();
    }
}

````
-  Maps
-   Sets
- Queues
