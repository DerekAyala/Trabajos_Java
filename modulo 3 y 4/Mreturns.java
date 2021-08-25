
public class Mreturns {
    public static void main(String[] args) {
        System.out.println("the result is : " + power(2, 3));
    }
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
}
}
