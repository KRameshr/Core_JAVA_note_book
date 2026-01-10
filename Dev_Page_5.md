## table of content

- [1. exception](#1-exception)
- [2. Classification of exceptions](#2-Classification of exceptions)
- [1. exception](#1-exception)


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
