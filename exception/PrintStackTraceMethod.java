public class PrintStackTraceMethod {
    public static void main(String[] args) {
        try {
            int a=9/0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }
}
