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
-  Map
    - Map contains the objects as key-value pair.
    - The keys in the Map are unique, but the values could be duplicate.
    - Some of the methods are put(Object,Object), get(Object),remove(Object), keySet(), entrySet() etc.
    - Entry is a inner class of map and is accessed via Map.Entry and has methods, getKey() and getValue().
    ````           
         package Demo;
         
         import java.util.HashMap;
         import java.util.Iterator;
         import java.util.LinkedHashMap;
         import java.util.Map;
         import java.util.TreeMap;
         
         import org.xml.sax.HandlerBase;
         
         public class First {
             public static void main(String[] args) {
                 //Map m = new HashMap<>();
                 //Map m = new LinkedHashMap();
         
                 Map m = new TreeMap();
         
                 System.out.println("1. Map is "+m);
                 m.put(1,"alpha");
                 m.put(2,"Beta");
                 m.put(3,"gamma");
                 System.out.println(" Map after is "+m);
                 m.remove(2);
                 System.out.println(" Map after is "+m);
                 m.put(2, "beta");
                 m.put(5, "Eeta");
         
         
                 Iterator it = m.keySet().iterator();
                 while (it.hasNext()) {
                     System.out.println("The values inside Map is  " + it.next() + " "+ m.get(it.next()));
                 }
         
             }
         }
       ````
-   Sets
- Queues
