
import java.util.Scanner;
public class proyect1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text to encrypt: ");
        String text = input.nextLine();
        System.out.print("Enter a key (an integer) for the encryption: ");
        int key = input.nextInt();
        System.out.print("How many characters should there be per group? Enter an integer: ");
        int num = input.nextInt();

        String groupedEncryptedText = encryptString(text, key, num);
        System.out.println(groupedEncryptedText);

        String decryptedText = decryptString(ungroupify(groupedEncryptedText), key);
        System.out.print("Decrypted text: ");
        System.out.println(decryptedText);
    }

    public static String encryptString(String text, int key, int num) {
        text = normalizeText(text);
        String encryptedText = caesarify(text, key);
        String groupedEncryptedText = groupify(encryptedText, num);

        return groupedEncryptedText;
    }

    public static String normalizeText(String text) {
        text = text.replace(" ", "");
        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace(";", "");
        text = text.replace(":", "");
        text = text.replace("?", "");
        text = text.replace("!", "");
        text = text.replace("(", "");
        text = text.replace(")", "");
        text = text.replace("\'", "");
        text = text.replace("\"", "");

        text = text.toUpperCase();

        return text;
    }

    public static String caesarify(String text, int key) {
        String encryptedText = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = shiftAlphabet(key);
        System.out.println(shiftedAlphabet);
        for (int i = 0; i < text.length(); i++) {
            encryptedText = encryptedText + shiftedAlphabet.charAt(alphabet.indexOf(text.charAt(i)));
        }

        return encryptedText;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String groupify(String encryptedText, int num) {
        int quotient = encryptedText.length() / num;
        int remainder = encryptedText.length() % num;
        int fill = 0;
        if (remainder != 0) {
            fill = num - encryptedText.length() % num;
        }

        String groupedEncryptedText = "";

        for (int i = quotient; i > 0; i--) {
            groupedEncryptedText = groupedEncryptedText + encryptedText.substring(0, num) + ' ';
            encryptedText = encryptedText.substring(num);
        }
        groupedEncryptedText = groupedEncryptedText + encryptedText;
        for (int j = fill; j > 0; j--) {
            groupedEncryptedText = groupedEncryptedText + 'x';
        }
        groupedEncryptedText = groupedEncryptedText.trim();

        return groupedEncryptedText;
    }

    public static String ungroupify(String groupedEncryptedText) {
        groupedEncryptedText = groupedEncryptedText.replace(" ", "").replace("x", "");
        return groupedEncryptedText;
    }

    public static String decryptString(String encryptedText, int key) {
        String text = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = shiftAlphabet(key);
        System.out.println(shiftedAlphabet);
        for (int i = 0; i < encryptedText.length(); i++) {
            text = text + alphabet.charAt(shiftedAlphabet.indexOf(encryptedText.charAt(i)));
        }
        System.out.println(text);

        return text;
    }
}