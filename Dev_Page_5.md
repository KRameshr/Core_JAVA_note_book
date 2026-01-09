## table of content

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
#### 3. Classification of exceptions
- Throwing exceptions to the caller
- reating your own exception class.
- Analyzing the stack trace
