class A{
  void show() throws ArithmeticException{
    System.out.println("Arithmetic exception one");
  }
}
class B extends A{
    void show() throws ArithmeticException{
    super.show();
        System.out.println("Arithmetic exception two");
      }
}
public class RuntimeRuntime {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
