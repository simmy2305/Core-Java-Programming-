public class Printstacktrace {
    public static void main(String[] args) {
        try {
            int a=9/0;
            System.out.println();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }
}
