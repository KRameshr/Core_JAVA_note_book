# Overview 

- Identifiers
- Variables & Constants
- Encoding Sets
- Separators
- Primitives
- Primitive Conversion
- Operators

# Identifiers 
- Names used for classes, methods, interfaces, and variables are called Identifiers.
- All identifiers must start with either a letter, currency character ($), or a connecting character like underscore (_).
- A Java keyword cannot be used as an identifier.
- Identifiers in Java are case-sensitive.

# Variables & Constants 

- Declare variables
- ssign values to variables.
- Declare & Initialize
```
    int var = 10;
    int $vsr = 30;
    int var2;
    var2 = 20;
    String name = "John";
    String Greeting;
    Greeting = "Hello";
    //     Const 
     final double  PI = 3.14;

     System.out.println(var);
     System.out.println($vsr);
     System.out.println(var2);
     System.out.println(name);
     System.out.println(Greeting);
     System.out.println(PI);
```

# Encoding Set 
- ASCII (American Standard Code for Information Interchange)
- Represented in 8 bits and represents all English alphabets, punctuations, etc.
- ISO-8859-1 (International Standards Organization)
- 8 Bits and contains all characters required for all western languages.

# Unicode 
- Developed by Unicode Consortium.
- Accommodates all characters of all languages in the world.
- Uses 16 bits.
- Encoding Set (Continued...)
    # UTF-8
  - Every character is encoded in 1 byte.
  - Suitable for texts having Latin letters.
    
    # UTF-16
    - Commonly used characters are encoded in 2 bytes.
    - Less common characters are encoded as pairs of 16-bit code units.
    - 
    # UTF-32
    - Uses 32 bits for every single character.
    - Not a choice for Internet applications.
    
# Separators 
```
Symbol   Uses
.	Refer methods/fields of objects 
,	To separate arguments in method signatures.
;	In For loops; Terminate Statements 
{}	Declare Arrays; Blocks 
()	To evaluate Conditions; Method signatures to contain lists of arguments; Narrowing conversions. 
[]	Declare Arrays; Refer array values 
< >	Pass parameters to parameterized types 
:	In For loops

Example 
     public class First {
        void myMethod(int age , String name) {
                System.out.println("Name: " + name + ", Age: " + age);
                // method signature: myMethod(int, String)
             }
           public static void main(String[] args) {
                First obj = new First();
                obj.myMethod(25, "Alice");
    
           }
    }
    
    public class First {
      public static void main(String[] args) {
        int [] number = new int[10];
            List<String> list = new ArrayList<String>();
            for(int i=0; i<10; i++) {
                number[i] = i * 2;
                list.add("Item " + i);
        
            }
            for(int num : number) {
                System.out.println(num);
            }
      }
    }
```
# Primitives in Java

In Java, primitive data types are the basic building blocks used to store simple values.  
Java has **8 primitive types**, grouped by the kind of data they hold.

────────────────────────────────────

1️⃣ Integer Types
────────────────────────────────────
Type    | Size    | Range                          | Default
--------|---------|--------------------------------|---------
byte    | 1 byte  | -128 to 127                    | 0
short   | 2 bytes | -32,768 to 32,767              | 0
int     | 4 bytes | -2³¹ to 2³¹−1                  | 0
long    | 8 bytes | -2⁶³ to 2⁶³−1                  | 0L

Example:
int age = 25;
long population = 1400000000L;

────────────────────────────────────
2️⃣ Floating-Point Types
────────────────────────────────────
Type    | Size    | Precision     | Default
--------|---------|---------------|---------
float   | 4 bytes | ~7 digits     | 0.0f
double  | 8 bytes | ~15 digits    | 0.0d

Example:
float price = 99.99f;
double pi = 3.14159265359;

────────────────────────────────────
3️⃣ Character Type
────────────────────────────────────
Type | Size    | Description
-----|---------|--------------------------
char | 2 bytes | Single Unicode character

Example:
char grade = 'A';
char symbol = '₹';

────────────────────────────────────
4️⃣ Boolean Type
────────────────────────────────────
Type     | Values
---------|---------------
boolean  | true or false

Example:
boolean isJavaFun = true;


# Primitive Conversions 

- Widening conversions 

  byte to short, int, long, float
  int to long, float, double
  float to double 

  ```
  public class First {
        public static void wideningExample() {
            float Flatvar  = 123.67F;
            double bigNum = (double)Flatvar; 
            System.out.println(Flatvar + " After Widening Example: " + bigNum);
         }
       public static void main(String[] args) {
       wideningExample();
      }
  }
  ```

- Narrowing Conversions

  short to byte
  int to short, byte
  double to float

  ```
  public class First {
       public static void NarrowingExample() {
            float longVar  = 123000000000000L;
            double intNum = (int)longVar; 
            System.out.println(longVar + " After NarrowingExample : " + intNum);
         }
       public static void main(String[] args) {
       NarrowingExample()
      }
  }
  ```
# Operators 


- Unary Operators
- Arithmetic Operators
- Relational & Conditional Operators
- Assignment Operators
- Logical & Shift Operators
- Other Operators
