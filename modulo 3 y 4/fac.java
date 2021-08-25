
public class fac {
    public static void main(String[] args) {
        System.out.println("Result is = " + factorial(3));
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}