// Write a method to perform Method Overloading

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Shaswata");
        int ans = sum(3, 4, 78);
        System.out.println("Ans is: " + ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.print("First one: ");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.print("Second one: ");
        System.out.println(name);
    }
}