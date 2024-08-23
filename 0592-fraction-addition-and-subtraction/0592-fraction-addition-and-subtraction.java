class Solution {
    private int GCD(int a, int b) {
        return a == 0 ? Math.abs(b) : GCD(b % a, a);
    }

    public String fractionAddition(String expression) {
        Scanner sc = new Scanner(expression).useDelimiter("/|(?=[-+])");
        int A = 0, B = 1;
        while (sc.hasNext()) {
            int a = sc.nextInt(), b = sc.nextInt();
            A = A * b + B * a;
            B = B * b;

            int gcd = GCD(A, B);
            A /= gcd;
            B /= gcd;
        }
        return A + "/" + B;
    }
}