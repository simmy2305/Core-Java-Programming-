public class ThrowCase3 {
    public static void main(String[] args) {
        throw new ArithmeticException("heloo");
        System.out.println("world");
        //we cant print msg after using throw
    }
}
