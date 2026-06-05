public class TypeCasting_7 {
    public static void main(String[] args) {
        double d = 9.99;
        int i = (int) d;          
        System.out.println("double " + d + " cast to int: " + i);
        int x = 100;
        double y = (double) x;    
        System.out.println("int " + x + " cast to double: " + y);
        long l = x;
        System.out.println("int " + x + " implicitly widened to long: " + l);
    }
}