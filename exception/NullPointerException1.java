public class NullPointerException1 {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch(NullPointerException ex) {
            System.out.println("exception handle");
        }
    }
}
