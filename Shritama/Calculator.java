public class Calculator {
    public static void main(String[]args)
    {
        // Here we will do Addition,Substraction,Multiplication and Division
        int n=10;
        int s=2;
        // Addition
        int add=n+s;
        System.out.println("The sum of 10 and 2: "+add);
        // Substraction
        int subs=n-s;
        System.out.println("The difference of 10 and 2: "+subs);
        // Multiplication
        int multi=n*s;
        System.out.println("The product of 10 and 2: "+multi);
        // Division
        int quo=n/s;
        int remain=n%s;
        System.out.println("The quotient after division is: "+quo+" and the remainder is: "+remain);
    }
}
