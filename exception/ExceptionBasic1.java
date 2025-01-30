public class ExceptionBasic1 {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch (Exception ex) {
            System.out.println("exception handle");
            System.out.println(ex);
        }
    }
}
