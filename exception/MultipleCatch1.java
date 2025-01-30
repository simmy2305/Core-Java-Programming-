public class MultipleCatch1 {
    public static void main(String[] args) {
        try {
            int a=9/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("array index out of the bond");
        }
        catch (NumberFormatException e) {
            System.out.println("number format exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        System.out.println("rest of code");
    }
}
