public class ArithmeticException1 {
    public static void main(String[] args) {
        try {
            int a=9/0;
            System.out.println(a);
        } 
        catch (ArithmeticException ex) {
            System.out.println("handle");
        }
    }
}
