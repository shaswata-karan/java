class Basics {
    public static void main(String[] args) 

// Functions
// A function is a block of code which takes some input, performs some
// operations and returns some output.
// The functions stored inside classes are called methods.
// The function we have used is called main.

// Class
// A class is a group of objects which have common properties.
// A class can have some properties and functions (called methods).
// The class we have used is FirstClass.


// Example1
// 'println' prints every statement in a new line
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("\n");

// Example2
// 'print' prints every statement in the same line
        System.out.print("Hello World");
        System.out.print("Hello World");
        System.out.println("\n");

// Example3
// '\n' inserts a new line at the specific point of the text
        System.out.println("*\n**\n***\n****\n");

// Variables
// A variable is a container (storage area) used to hold data.
// Each variable should be given a unique name (identifier).

// Data Types
// Data types are declarations for variables.
// This determines the type and size of data associated with variables which is
// essential to know since different data types occupy different sizes of
// memory.

// There are 2 types of Data Types :
// Primitive Data types : to store simple values
// Non-Primitive Data types : to store complex values

// Primitive Data Types
// These are the data types of fixed size.
// -> byte - 1
// -> short - 2
// -> int - 4
// -> long - 8
// -> float - 4
// -> double - 8
// -> char - 2
// -> boolean - 1

// Non-Primitive Data Types
// These are of variable size & are usually declared with a ‘new’ keyword.
// Eg : String, Arrays

// Constants
// A constant is a variable in Java which has a fixed value
// i.e. it cannot be assigned a different value once assigned.

// Example4
        int a = 10;
        int b = 20;
        int sum = (a + b);
        System.out.println("Sum = " + sum);
        int diff = (b - a);
        System.out.println("Difference = " + diff);
        int mul = (a * b);
        System.out.println("Multiplication = " + mul);

// Example5
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
// 'sc.next' takes input only the first word/token.
// 'sc.nextLine' takes input the whole line.
// nextInt - for taking integer input
// nextFloat - for taking float input
        System.out.println("Name is: " + name);
    
}