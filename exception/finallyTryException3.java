public class finallyTryException3 {
    public static void main(String[] args) {
        try {
            int a=8/0;
            System.out.println(a);
        } 
        catch (Exception e) {
            System.out.println(e);
            System.out.println("exception handle");
        }
        finally{
            try {
                String s=null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception");
            }
        }
    }
}
