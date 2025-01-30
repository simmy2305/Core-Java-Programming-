public class MultipleCatchException {
    public static void main(String[] args) {
        try {
            int a=9/0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("array index out of bound exception handle");
        }
        catch (NullPointerException ex) {
            System.out.println("null pointer exception handle");
        }
        catch (ArithmeticException ex) {
            System.out.println("arithmetic exception handle");
        }
    }
}
