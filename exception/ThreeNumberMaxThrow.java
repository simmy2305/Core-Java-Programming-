class A extends Exception{
    public static void max(int a,int b,int c){
      if(a>b && a>c){
        throw new ArithmeticException("A is greater");
      }
      else if(b>a && b>c){
        throw new ArithmeticException("B is greater");
      }
      else if(c>a && c>b){
        throw new ArithmeticException("C is greater");
      }
      else{
        System.out.println(" exception handle");
      }
    }
}
public class ThreeNumberMaxThrow {
    public static void main(String[] args) {
        A.max(45, 23, 89);
    }
}
