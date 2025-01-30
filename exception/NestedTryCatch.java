public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int a=9/0;
                System.out.println(a);
                
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic  exception inner block");
            }
        } catch (Exception e) {
            System.out.println("outer block");
        }
        System.out.println("rest of the code");
    }
}
