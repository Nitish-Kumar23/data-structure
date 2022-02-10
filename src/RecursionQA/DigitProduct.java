package RecursionQA;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitProduct(13452));
    }

    private static int digitProduct(int n) {
        if(n%10==n)
            return n;
        return n%10*digitProduct(n/10);
    }
}
