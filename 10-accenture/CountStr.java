public class CountStr {
    public static void main(String[] args) {
        String words = "Hi my name is Shaswata";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
