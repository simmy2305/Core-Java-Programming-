public class FinallyTryException2 {
    public static void main(String[] args) {
        try {
            int a=10/2;
            System.out.println(a);
            
        } finally{
            System.out.println("finally block");
        }
        System.out.println("rest of the code");
    }
}
