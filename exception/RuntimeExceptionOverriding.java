class A{
  void show() throws ArithmeticException{
    System.out.println("parent exception");
  }
}
class B extends A{
    void show() throws Exception{
        System.out.println("child exception");
      }
}
public class RuntimeExceptionOverriding {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
