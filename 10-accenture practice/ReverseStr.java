public class ReverseStr {
    public static void main(String[] args) {
        String str="Geeks";
        String newstr="";
        char ch;
        for (int i = str.length()-1; i >= 0; i--) {
            ch=str.charAt(i);
            newstr=newstr+ch;
        }
        System.out.println(newstr);
    }
}
