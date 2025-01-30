public class MultipleCatch2 {
    public static void main(String[] args) {
        try {
            int a=7/0;
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("number format exception handle");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handle");
        }
        catch (Exception e) {
            System.out.println("exception handle");
        }
    }
}
