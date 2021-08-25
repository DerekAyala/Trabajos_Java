
public class smethod {
    public static void main(String[] args) {
        String original = "abcd";
        for (int i = 0 ; i < original.length();i++){
            System.out.println("The character at index " + i + " is " + original.charAt(i));
        }
        System.out.println("the letter 'a' is at index " + original.indexOf('d'));
    }
}