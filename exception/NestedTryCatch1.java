public class NestedTryCatch1 {
    public static void main(String[] args) {
        try {
            try {
                int a=7/0;
                System.out.println(a);
            } catch (NullPointerException e) {
                System.out.println("null pointer exception inner block");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception outer block");
        }
        System.out.println("rest of the code");
    }
}
