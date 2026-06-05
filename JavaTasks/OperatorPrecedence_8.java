public class OperatorPrecedence_8{
    public static void main(String[] args) {
        int r1 = 10 + 5 * 2;          // 20, not 30
        int r2 = (10 + 5) * 2;        // 30
        int r3 = 10 + 6 / 2 - 1;      // 12
        int r4 = 2 + 3 * 4 - 8 / 2;   // 10
        boolean r5 = 5 > 3 && 2 < 4 || 1 == 2; // true

        System.out.println("10 + 5 * 2       = " + r1);
        System.out.println("(10 + 5) * 2     = " + r2);
        System.out.println("10 + 6/2 - 1     = " + r3);
        System.out.println("2+3*4-8/2        = " + r4);
        System.out.println("5>3 && 2<4||1==2 = " + r5);
    }
}