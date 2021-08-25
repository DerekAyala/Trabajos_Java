
public class over {
    public static void main(String[] args) {
        power1(3);
    }
    public static void power1(int exp) {
        power2(2, exp);
    }
    public static void power2(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("base to the " + exp + " = " + result);
    }
}