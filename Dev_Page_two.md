Overview 

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
Symbol Uses
.     Refer methods
/     fields of objects 
,To separate arguments in method signatures. 39;In For loops; Terminate Statements 40{}Declare Arrays; Blocks 41()To evaluate Conditions; Method signatures to contain lists of arguments; Narrowing conversions. 42[]Declare Arrays; Refer array values 43< >Pass parameters to parameterized types 44:In For loops 45 ```
