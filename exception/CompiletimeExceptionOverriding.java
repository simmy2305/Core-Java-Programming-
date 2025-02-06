import java.io.IOException;

class A{
 void show() throws IOException{
    System.out.println("parent compiletime exception");
 }
}
class B extends A{
    void show() throws Exception{
        System.out.println("child exception");
     }
}
public class CompiletimeExceptionOverriding {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
