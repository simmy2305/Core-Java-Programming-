class A extends Exception{
    public static void Zero(int input){
        if(input==0){
            throw new ArithmeticException("Zero");
        }
        else{
          System.out.println("not a zero");
        }
      }
}

public class ZeroThrow {
    public static void main(String[] args) {
        A.Zero(0);
    }
}
