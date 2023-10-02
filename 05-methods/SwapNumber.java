// Write a method to swap 2 numbers.

public class SwapNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap Num1 = " + a + " Num2 = " + b);

        //swap numbers code
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After swap Num1 = " + a + " Num 2 = " + b);
    }
}
