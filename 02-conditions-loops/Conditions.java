public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

// Example1
// Conditional Statements ‘if-else’

// The if block is used to specify the code to be executed if the condition
// specified in if is true, the else block is executed otherwise.

        System.out.println("Enter your age to check you are Adult or not");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are not an Adult");
        }

// Example2
        System.out.println("Enter a number to check odd/even");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

// Example3
        System.out.println("Enter two numbers a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

// Example4
        System.out.println("Enter button number");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }

// Example5
// Conditional Statements ‘switch’
        
// Switch case statements are a substitute for long if statements that compare a
// variable to multiple values. After a match is found, it executes the
// corresponding code of that value case.

        System.out.println("Enter button number, this time we are using switch case");
        int buttonnew = sc.nextInt();

        switch (buttonnew) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}