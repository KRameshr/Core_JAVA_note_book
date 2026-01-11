## table of content

- [1. Exception](#1-exception)
- [2. Classification of Exceptions](#2-classification-of-exceptions)
- [3. What is an Interface?](#3-what-is-an-interface)
- [4. Creating and Using an Interface](#4-creating-and-using-an-interface)
- [5. Extending Interfaces](#5-extending-interfaces)
- [6. Implementing Multiple Interfaces](#6-implementing-multiple-interfaces)
- [7. What are Abstract Classes?](#7-what-are-abstract-classes)
- [8. Creating and Using Abstract Classes](#8-creating-and-using-abstract-classes)
- [9. Differences Between Abstract Classes and Interfaces](#9-differences-between-abstract-classes-and-interfaces)



## 1. exception

#### What is exception?
- java.lang.Exception object encapsulates the error conditions and throws it back to the running code.
- Sub class of Throwable.
- Class “Error” denotes the fatal errors.
- Class “Exception” denotes non-fatal errors.
- Helpful in providing answers to what ,how and where things went wrong in the code.

```
package Demo;

public class First  {

    
    public static void main(String[] args) {
        int num = 25;
        try {
            for(int i = 1 ; i<=25; i-- ){
                if(num%i == 0){
                    System.out.format("Is divided %s \n",i,num);
                }
            }
        }
        catch(Exception e){
            System.out.println("Some Exception is happen we are some  inside in Exception");
        }
        finally {
            System.out.println("We are Inside in the final bock");
        }        
    }

    
}
```
#### 2. Constructs to deal with exceptions
```
    try{
    //statements
    }
    catch (Exception e) { //optional
    //statements to handle exception
    }
    finally { //optional
    //statements to handle exception & cleanup
    }

Example
package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class First  {

    
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String  urlSting = br.readLine();
            URL url = new URL(urlSting);
            br= new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.format("\n "+br.readLine());

        }
        catch(MalformedInputException mie){
            System.out.println("Some Exception is happen we are some  inside in MalformedInputException");
        }
        catch(IOException ioe){
            System.out.println("Some Exception is happen we are some  inside in IOException");

        }
        catch(Exception e){
            System.out.println("Some Exception is happen we are some  inside in Exception");
        }
        finally {
            System.out.println("We are Inside in the final bock");
        }        
    }
 
}
```
## 2. Classification of exceptions
- Throwing exceptions to the caller
- reating your own exception class.
- Analyzing the stack trace
- Checked Exceptions or compile time exceptions, like IOException, MalformedURLException etc.
- Compiler forces these exceptions to be caught or passed to calling program
- Unchecked exceptions or runtime exceptions, like ArithmeticException, ArrayIndexOutofBoundsException etc.
- ompiler does not force to handle these unchecked exceptions.

```
package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First  {
    public static int readDate() throws NumberFormatException, IOException {
         int retVal=0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String  urlSting = br.readLine();
            retVal = Integer.parseInt(urlSting);
          br.close();
          return retVal;  
    }
    public static void printDiv(int n) throws IOException {
            for(int i=1; i<25; i++){
                if(n%i==0){
                    System.out.format("%s divides %s \n",i,n);
                }
            }
    }
    public static void main(String[] args) throws IOException {
        try{
            int input = readDate();
            System.out.println("Get the Input "+ input);
            printDiv(input);
        } catch(NumberFormatException nfe){
            System.err.println("Inside nfe");
        } catch(IOException ioe){
            System.err.println("Inside ioe");
        }catch(Exception e){
            System.err.println("Inside e");
        } finally {
            System.err.println("Inside finally");
        }
            
    }
 
}
```
###### Throwing exceptions to the caller
- In case programmer wants to hide exception details and give summary, he can create his own exception class.
- The user defined exception classes must extend Exception class.
###### Analyzing the stack trace
- e.printStackTrace() method gives the information as to from where the exception gets thrown and path leading to it.
  
````
    package Demo;
    public class First  {
        public static void testsuger(int val) throws LowSugerException,HighSugerException{
            if(val < 70) {
                throw new LowSugerException("the suger is low");
            }else if(val >=70 && val<=130){
                System.out.println("The Suger is fine");
            }else {
                throw new HighSugerException("the suger is High");
            }
        }
            public static void main(String[] args) throws HighSugerException {
                method1();
                   
            }
            static void method1(){
                method2();
            }
            static void method2() {
                    int[] sugerData  = new int[]{90,56,35,57,58};
                    for(int i  : sugerData){
                        try{
                                testsuger(i);
                                System.out.println("sugar is fine for " + i);
                        
                        }catch(LowSugerException lsex){
                            System.out.println("sugar is fine for" +lsex.getMessage());
                        }
                        catch(HighSugerException hsex){
                            System.out.println("sugar is fine for" +hsex.getMessage());
                        }
                        catch(Exception e){
                            System.out.println("Exception" );
                        }
            }
        }
     
    }
    
    
    class LowSugerException extends Exception {
        public LowSugerException(String Message){
            super(Message);
        }
    }
    
    class HighSugerException extends Exception {
        public HighSugerException(String Message){
            super(Message);
        }
    
    }
````
### 3. What is an Interface?

- It is a mechanism by which Java somewhat achieves multiple inheritance.
- It is a system using which unrelated objects interact with each other.
- An interface is a class where all the fields are public,static & final and all the methods are public & abstract.
- But it is different from multiple inheritance
  Code sample
````
package Demo;
public class First  {
    public static void main(String[] args)  {
        GasVehicle gasObj = new GasVehicle();
        gasObj.milesCounter = 100;
        gasObj.fuelConsumed = 20;
        System.out.println("Efficiecy  of gas vehical is "+gasObj.getMileage());
           

        ElectricVehicle eObj = new ElectricVehicle();
        eObj.milesCounter = 100;
        eObj.powerConsumed = 15;
        System.out.println("Efficiecy  of ElectricVehicle is "+eObj.getMileage());

               
    }
        
}

// interface

 interface fuelEfficiecy {
    int  testInferface = 10; //public static final integer
    float getMileage(); //abstract method
}
 
class GasVehicle implements fuelEfficiecy {
    float milesCounter;
    float fuelConsumed;

    public float getMileage(){
        return milesCounter/fuelConsumed;
    }

}

class ElectricVehicle implements fuelEfficiecy {
    float milesCounter;
    float powerConsumed;

    public float getMileage(){
        return milesCounter/powerConsumed;
    }

}

````
  
### 4. Creating and Using an Interface
````
<Modifier> interface <InterfaceName> extends <InterfaceNames>
//statement block
}
class <ClassName> implements < InterfaceName >{
//statement block
}
````
### 5. Extending Interfaces

- An interface, unlike other classes can extend multiple interfaces.
- A class implementing an extended interface has to implement the methods of both the interface, as well as its ancestors.
````
package Demo;
public class First  {
    public static void main(String[] args)  {
        GasVehicle gasObj = new GasVehicle();
        gasObj.milesCounter = 100;
        gasObj.fuelConsumed = 20;
        System.out.println("Efficiecy  of gas vehical is "+gasObj.getMileage());
           

        ElectricVehicle eObj = new ElectricVehicle();
        eObj.milesCounter = 100;
        eObj.powerConsumed = 15;
        System.out.println("Efficiecy  of ElectricVehicle is "+eObj.getMileage());

        HybridVehicle hObj = new HybridVehicle();
        hObj.milesCounter = 100;
        hObj.powerConsumed = 10;
        hObj.fuelConsumed = 10;
        System.out.println("Efficiecy  of HybridVehicle is "+hObj.getMileage());
       
    }
        
}

// extend interface

interface fuelEfficiecy {
    int  testInferface = 10; //public static final integer
    float getMileage(); //abstract method
}

interface hybriEfficiecy extends fuelEfficiecy  {
    float getFuelEfficiecy ();
    float getChargeEfficiecy ();
}

class HybridVehicle implements hybriEfficiecy {
    float milesCounter;
    float fuelConsumed;
    float powerConsumed;
    public float getFuelEfficiecy (){
        return milesCounter/fuelConsumed;
    }
    public float getChargeEfficiecy () {
        return milesCounter/powerConsumed;
    }
    public float getMileage(){
        return ((0.5f * getFuelEfficiecy() )+(0.5f *getChargeEfficiecy()));
    }

}
 
class GasVehicle implements fuelEfficiecy {
    float milesCounter;
    float fuelConsumed;

    public float getMileage(){
        return milesCounter/fuelConsumed;
    }

}

class ElectricVehicle implements fuelEfficiecy {
    float milesCounter;
    float powerConsumed;

    public float getMileage(){
        return milesCounter/powerConsumed;
    }

}

````
### 6. Implementing Multiple Interfaces

- A class can choose to implement multiple interfaces.
-  It then has to implement all the methods defined in all the chosen interfaces.
- Helpful in spreading concept of multiple inheritance, where a class chooses to pick multiple behavioral patterns.

````
// multiple interface

package Demo;
public class First  {
    public static void main(String[] args)  {
        GasVehicle gasObj = new GasVehicle();
        gasObj.milesCounter = 100;
        gasObj.fuelConsumed = 20;
        System.out.println("Efficiecy  of gas vehical is "+gasObj.getMileage());
           

        ElectricVehicle eObj = new ElectricVehicle();
        eObj.milesCounter = 100;
        eObj.powerConsumed = 15;
        eObj.chageBattey();
        System.out.println("Efficiecy  of ElectricVehicle is "+eObj.getMileage());

        HybridVehicle hObj = new HybridVehicle();
        hObj.milesCounter = 100;
        hObj.powerConsumed = 10;
        hObj.fuelConsumed = 10;
        hObj.chageBattey();
        System.out.println("Efficiecy  of HybridVehicle is "+hObj.getMileage());

        batteryMachine bmobj = new a ();
        bmobj.chageBattey();
        bmobj = new b ();
        bmobj.chageBattey();
       
    }
        
}

// extend interface

interface fuelEfficiecy {
    int  testInferface = 10; //public static final integer
    float getMileage(); //abstract method
}

interface hybriEfficiecy extends fuelEfficiecy  {
    float getFuelEfficiecy ();
    float getChargeEfficiecy ();
}

interface batteryMachine {
    void chageBattey();

}

class a implements batteryMachine {
    public void chageBattey() {
        System.out.println("Change A's battery"); 
    }
}

class b implements batteryMachine {
    public void chageBattey() {
        System.out.println("Change B's battery"); 
    }
}
    
class GasVehicle implements fuelEfficiecy {
    float milesCounter;
    float fuelConsumed;

    public float getMileage(){
        return milesCounter/fuelConsumed;
    }

}

class ElectricVehicle implements fuelEfficiecy , batteryMachine {
    float milesCounter;
    float powerConsumed;

    public void chageBattey() {
        System.out.println("Change ElectricVehicle's battery"); 
    }

    public float getMileage(){
        return milesCounter/powerConsumed;
    }

}

class HybridVehicle implements hybriEfficiecy, batteryMachine {
    float milesCounter;
    float fuelConsumed;
    float powerConsumed;

    public  void chageBattey(){
        System.out.println("Change hybrid's battery");
    }

    public float getFuelEfficiecy (){
        return milesCounter/fuelConsumed;
    }
    public float getChargeEfficiecy () {
        return milesCounter/powerConsumed;
    }
    public float getMileage(){
        return ((0.5f * getFuelEfficiecy() )+(0.5f *getChargeEfficiecy()));
    }

}
 
````
### 7. What are Abstract Classes?
### 8. Creating and Using Abstract Classes
### 9. Differences Between Abstract Classes and Interfaces







````
