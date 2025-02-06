import java.io.IOException;
class  A{
  void show() throws ArithmeticException{
    System.out.println("Arithmetic exception");
  }
}
class B{

    void show() throws IOException{
        System.out.println("IO exception");
      }
}
public class RuntimeComplietime {
    public static void main(String[] args) {
        B p=new B();
        try {
            p.show();
        } catch (Exception e) {
            System.out.println("handle");
        }
    }
}
