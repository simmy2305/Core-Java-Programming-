public class ExceptionBasic2 {
    public static void main(String[] args) {
        try {
            String s =null;
            System.out.println(s.length());
        } catch (RuntimeException ex) {
            System.out.println("Runtime exception");
            System.out.println(ex);
        }
    }
}
