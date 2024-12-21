public class ReverseANo {
    public static void main(String[] args) {
        int num=54321;
        int rev=0;
        while (num!=0) {
            int rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
