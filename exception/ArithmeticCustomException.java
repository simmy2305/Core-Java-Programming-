class A extends Exception{
    public A(String message){
      System.out.println(message);
    }
}
class B{
    public static void ArithmeticCustomException(int a,int b){
        if(b==0){
            try {
              throw new A("Arithmetic exception");
            } catch (Exception e) {
              System.out.println("handle");
            }
        }
      else{
        System.out.println("Result : "+a/b);
      }
    }
}
public class ArithmeticCustomException {
    public static void main(String[] args) {
        B.ArithmeticCustomException(9,0);
    }
}
