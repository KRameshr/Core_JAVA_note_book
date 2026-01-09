## table of content

- [1. exception](#1-exception)


## 1. exception

# What is exception?
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
- Constructs to deal with exceptions
- Classification of exceptions
- Throwing exceptions to the caller
- reating your own exception class.
- Analyzing the stack trace
