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

    

######  Lists

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

###### Map
    - Map contains the objects as key-value pair.
    - The keys in the Map are unique, but the values could be duplicate.
    - Some of the methods are put(Object,Object), get(Object),remove(Object), keySet(), entrySet() etc.
    - Entry is a inner class of map and is accessed via Map.Entry and has methods, getKey() and getValue().
###### Map Interface(Continued…)
    - HashMap implementation can have one null key and it maintains no order of the elements stored.
    - HashTable also an implementation of Map, does not allow null key values and is synchronised.
    - LinkedHashMap also acts like a HashMap, but it maintains the natural insertion order of elements.
    - TreeMap cannot have null key and it maintains the elements in ascending order.
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

######  Sets
      - Set is a collection of unique objects and it does not allow duplicates.
      - HashSet implementation uses hashtable for storing these objects.
      - LinkedHashSet implementation uses linked list for storing these objects. Insertion/Delete thus, are fast here.
      - TreeSet implementation uses a tree for storing these objects in sorted order. Hence searching is fastest here.
````
      package Demo;
      
      import java.util.HashSet;
      import java.util.Iterator;
      import java.util.LinkedHashSet;
      import java.util.Set;
      
      public class First {
          public static void main(String[] args) {
      
               //Set<String> hashSet = new HashSet<>();
              Set<String> hashSet = new LinkedHashSet(); // unique order
              hashSet.add("obj1");
              hashSet.add("obj3");
              hashSet.add("obj2");
      
              System.out.println("Before removal: " + hashSet);
      
              hashSet.remove("obj3");
      
              System.out.println("After removal: " + hashSet);
      
              Iterator<String> it = hashSet.iterator();
      
              while (it.hasNext()) {
                  System.out.println("Inside while loop and vlaue in set is "+it.next());
              }
          }
      }


````

###### Queues
- Queue interface typically, but not necessarily keeps the elements in the FIFO order.
- Some of the methods of this interface are add(Object), remove(), poll(), peek() etc.
- A typical implementation of the Queue is a LinkedList and PriorityQueue(this maintains the elements in natural order).

````
package Demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class First {
    public static void main(String[] args) {
        // Queue q = new LinkedList<>();
        Queue q = new PriorityQueue();
        System.out.println("1.the values in " + q );
        q.add(1);
        q.add(3);
        q.add(2);
        q.add(4);
        q.add(5);
        System.out.println("1.the values in " + q.peek() );
        System.out.println("2.the values in " + q );

        System.out.println("3.the values in " + q.poll() );
        System.out.println("4.the values in " + q );

        System.out.println("5.the values in " + q.remove() );
        System.out.println("6.the values in " + q );
        

    }
}
````

- Java Generic Features
- Generic List in Java
- Generic Map in Java
- Java Generic Classes & Methods
- Java Generic For Loop
- Generic WildCard


###### Java Generics

Java Generics was introduced in Java 5 to deal with type-safe objects. Using generics a programmer can force to store a specific type of objects in collection.


````
E.g. List<Integer> list = new ArrayList<>(); 


````
Advantages are :-
 - Type Safety:- Only one specific type of Objects are allowed to be stored in collection.
 - Type Casting not required.
 - Compile time verification.


###### Generic List in Java

- A list can be generified.
  
````
E.g.
List <Integer> l = new ArrayList<>(); 
List<String> l2= new ArrayList<>(); 
Demo to see a generic List and how to iterate over it.


package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First {
    public static void main(String[] args) {
      List<Integer> inList = new ArrayList<>();
      inList.add(1);
      inList.add(2);
      inList.add(3);
      System.out.println("intList is"+ inList);
     
      Iterator<Integer> it = inList.iterator();
      while (it.hasNext()) {
        System.out.println("The value is "+it.next());
      }

    }
}
````

###### Generic Map in Java

- Following is a way to create a generic map.

````
Map <Integer, String > myMap = new HashMap<>();
````
Generic Iterators could be created for keys and values.
````
E.g. Iterator<Integer> keyIt= myMap.keySet().iterator();

````

Java Generic Classes & Methods 

Even the classes & methods we define can be generified.
Demo for creating and using generic classes & methods.

###### Generic WildCard

Unknown wildcard a.k.a. unbounded e.g. List<?> elements.
Extends wildcard a.k.a. Upper Bounded e.g. List <? extends superClass>
Super wildcard a.k.a. Lower Bounded e.g. List <? super superClass> Intel ipaat Software Solutions Pvt. Ltd.

###### Set Interface

Set is a collection of unique objects and it does not allow duplicates.
HashSet implementation uses hashtable for storing these objects.
LinkedHashSet implementation uses linked list for storing these objects. Insertion/Delete thus, are fast here.
TreeSet implementation uses a tree for storing these objects in sorted order. Hence searching is fastest here.

###### Map Interface

Map contains the objects as key-value pair.
The keys in the Map are unique, but the values could be duplicate.
Some of the methods are put(Object,Object), get(Object), remove(Object), keySet(), entrySet() etc.
Entry is a inner class of map and is accessed via Map.Entry and has methods, getKey() and getValue().

###### Map Interface(Continued…)

HashMap implementation can have one null key and it maintains no order of the elements stored.
HashTable also an implementation of Map, does not allow null key values and is synchronised.
LinkedHashMap also acts like a HashMap, but it maintains the natural insertion order of elements.
TreeMap cannot have null key and it maintains the elements in ascending order.


###### Queue Interface

Queue interface typical y, but not necessarily keeps the elements in the FIFO order.
Some of the methods of this interface are add(Object), remove(), poll(), peek() etc.
A typical implementation of the Queue is a LinkedList and PriorityQueue(this maintains the elements in natural order).

example

````

package Demo;

import java.util.*;
import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
      List<? super A > i = new ArrayList<>();
      i.add(new A());
      i.add(new B());
      i.add(new C());



        // mapDemo();
        // classDemo();
        listDemo();
    }



    // wildcard demo
    static void wildcardDemo(List<?> l) {
        for (Object o : l) {
            System.out.println("The item is: " + o);
        }
    }

    static double wildcardDemo2(List<? extends Number> l) {
      double sum = 0;
      for (Number o : l) {
          sum = sum + o.doubleValue();
      }
      return sum;
    }


    // generic method
    static <T> boolean isPresent(T e1, Collection<T> c) {
        for (T i : c) {
            if (e1.equals(i)) return true;
        }
        return false;
    }

    static void listDemo() {
        List<Integer> intList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        strList.add("alpha");
        strList.add("beta");
        strList.add("gamma");

        System.out.println("String List: " + strList);

        wildcardDemo(intList);
        wildcardDemo(strList);
        System.out.println("Sum of inList "+wildcardDemo2(intList));

        List<Double> dList = new ArrayList<>();
        dList.add(25.25);
        dList.add(55.25);
        dList.add(35.25);
        System.out.println("Sum of inList "+dList);
        System.out.println("Sum of inList "+wildcardDemo2(dList));

    }

    static void mapDemo() {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Alpha");
        m.put(2, "Beta");
        m.put(3, "Gamma");

        System.out.println("Map: " + m);
        System.out.println(m.get(2).concat(" hello world"));

        Iterator<Integer> keyIt = m.keySet().iterator();
        while (keyIt.hasNext()) {
            System.out.println("The value is: " + m.get(keyIt.next()));
        }
    }

    static void classDemo() {
        MyQueue<String> strQ = new MyQueue<>();
        strQ.enqueue("alpha");
        strQ.enqueue("beta");
        strQ.enqueue("gamma");

        System.out.println("String Queue: " + strQ.i);
        String str = strQ.dequeue();
        System.out.println(str + " dequeued → " + strQ.i);

        MyQueue<Integer> intQ = new MyQueue<>();
        intQ.enqueue(1);
        intQ.enqueue(2);
        intQ.enqueue(3);

        System.out.println("Integer Queue: " + intQ.i);
        Integer int1 = intQ.dequeue();
        System.out.println(int1 + " dequeued → " + intQ.i);

        System.out.println("Is alpha present? " + isPresent("alpha", strQ.i));
        System.out.println("Is beta present? " + isPresent("beta", strQ.i));

        System.out.println("Is 3 present? " + isPresent(3, intQ.i));
        System.out.println("Is 10 present? " + isPresent(10, intQ.i));
        
    }
}

class MyQueue<T> {
    LinkedList<T> i = new LinkedList<>();

    public void enqueue(T obj) {
        i.addLast(obj);
    }

    public T dequeue() {
        return i.removeFirst();
    }
}

class A {
}

class B extends A {
}
class C extends B {
}

````

###### Input/Output Streams
  
- Stream is an abstraction and can be thought of as flow of data from source to sink.
- Source or InputStream initiates the flow of data.
- Sink or OutputStream terminates the flow of data.
- There is no concept of index like array in stream. It is just the flow of  data.
- Two types of Streams: Byte & Character Based

````
package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class First {

    static void callStramDemo(){
        try {
            int size = 0;
            int i;
            byte[] arr = new byte[256];
            InputStream in = new FileInputStream( "C:\\Users\\ramesh\\Downloads\\update Resume\\Module-14-Java-IO1.pdf");
            OutputStream out = new FileOutputStream("C:\\Users\\ramesh\\Downloads\\update Resume\\copy.pdf");

            while ((i = in.read(arr)) != -1) {
                size++;
                out.write(arr,0,i);
            }
            in.close();
            out.close();

            System.out.println("File copied successfully!");
            System.out.println("The file size is: " + size + " bytes");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void charDemo(){
        try{
            int i = 0;
            char[] charArr = new char[256];
            FileReader fin = new FileReader("C:\\Users\\ramesh\\Downloads\\update Resume\\Module-14-Java-IO1.pdf");
            PrintWriter pw = new PrintWriter(System.out);

            while ( (i=fin.read(charArr))!= -1 ) {
                pw.write(charArr,0,i); 
            }
            fin.close();pw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
       try {
        String str ="";
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ramesh\\Downloads\\update Resume\\Module-14-Java-IO1.pdf"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\ramesh\\Downloads\\update Resume\\Module-14-Java-IO1.pdf"));

        while( (str=br.readLine()) != null ) {
            wr.write(str);
            wr.newLine();
        }
        br.close();
        wr.close();
       }catch (Exception e) {
            e.printStackTrace();
        }

      

    }
}


class  Customer implements Serializable {
    String name;
    Integer id ;
    Customer (String name ,Integer id){
        this.name = name;
        this.id = id ;

    }
    public String toString(){
        return "Name of Customer::"+ this.name+"and id is "+this.id;
    }
}
````

###### Byte Oriented Streams

- InputStream class is used for reading the data in terms of bytes.
- Some of the methods are  read(), read(byte[]), read(byte[],int,int),  close() etc.
-  OutputStream class is used for representing the output stream of  data.
-  Some of the methods are write(int), write(byte[]), write(byte[], int,int), close() etc.
-   Demo

###### Character Oriented Streams
- Reader and Writer classes & their sub-classes are used for dealing with the characters.
- read() and print() methods are used by these to read and write respectively.
- BufferedReader and BufferedWriter classes provide the built-in buffer for reading and writing the data.
-  readLine() and write() are some methods used for reading and writing data by these classes.
-  Demo
  
###### bject Serialization

  - Serialization of objects is needed in case one wants to persist the objects in the permanent storage.
  - For reading & writing an object in a file, it should implement the Serializable interface.
  -  ObjectInputStream & ObjectOutputStream are used to read & write the objects to a file.
  -  They make use of witeObject & readObject methods, along with readXXX & writeXXX methods for the primitives.
````
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class First {

    static void callStramDemo(){
        try {
            int size = 0;
            int i;
            byte[] arr = new byte[256];
            InputStream in = new FileInputStream( "C:\\Users\\ramesh\\Downloads\\update Resume\\Module-14-Java-IO1.pdf");
            OutputStream out = new FileOutputStream("C:\\Users\\ramesh\\Downloads\\update Resume\\copy.pdf");

            while ((i = in.read(arr)) != -1) {
                size++;
                out.write(arr,0,i);
            }
            in.close();
            out.close();

            System.out.println("File copied successfully!");
            System.out.println("The file size is: " + size + " bytes");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void charDemo(){
        try{
            int i = 0;
            char[] charArr = new char[256];
            FileReader fin = new FileReader("C:\\Users\\ramesh\\Downloads\\update Resume\\Module-14-Java-IO1.pdf");
            PrintWriter pw = new PrintWriter(System.out);

            while ( (i=fin.read(charArr))!= -1 ) {
                pw.write(charArr,0,i); 
            }
            fin.close();pw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        try {
            // Writing object
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\ramesh\\Downloads\\update Resume\\customer.ser")
            );

            Customer c1 = new Customer("c1", 1);
            out.writeObject(c1);
            out.close();

            // Reading object
            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\ramesh\\Downloads\\update Resume\\customer.ser")
            );

            Customer c2 = (Customer) in.readObject();
            in.close();

            System.out.println(c2.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class  Customer implements Serializable {
    String name;
    Integer id ;
    Customer (String name ,Integer id){
        this.name = name;
        this.id = id ;

    }
    public String toString(){
        return "Name of Customer::"+ this.name+"and id is "+this.id;
    }
}
````
###### annel Based I/O

- Java Channels are similar to the Streams, with few differences:-
- We can both read and write to a channel.
- These are always read from/written to a buffer.
- these can be read and written asynchronously.
- Buffers are block of memory closely coupled with the underlying operating system. These too like arrays are of fixed capacity.
- Data can be read/written into a buffer and these are used when interacting with channels.
- Demo
  
````
package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class First {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\ramesh\\Downloads\\update Resume\\customer.ser");
            FileOutputStream fout = new FileOutputStream("C:\\Users\\ramesh\\Downloads\\update Resume\\customer.ser");

            FileChannel in =  fin.getChannel();
            FileChannel out = fin.getChannel();
            int bufferSize = 2048;
            ByteBuffer buff = ByteBuffer.allocate(bufferSize);

            long start = System.nanoTime();
            while ( in.read(buff)> 0) {
                buff.flip();
                out.write(buff);
                buff.clear();  
            }
            System.out.println("time"+ ((System.nanoTime()-start)/1000000));
        }catch(Exception e){
            System.out.println(e);
        }
    }    


}
````


