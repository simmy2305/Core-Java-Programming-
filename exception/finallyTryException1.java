public class finallyTryException1 {
    public static void main(String[] args) {
        try {
            
            int a =9/0;
            System.out.println(a);

        } 
         catch(ArithmeticException ex){
             System.out.println("arithmetic exception");
         }
        finally{
            System.out.println("always executed block");
        }

        System.out.println("rest of the code");
    }
}
