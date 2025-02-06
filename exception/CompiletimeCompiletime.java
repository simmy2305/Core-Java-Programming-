import java.io.IOException;

class A{
void show() throws IOException{
    System.out.println("parent exception class");
}
}
class B extends A{
    void show() throws IOException{
        System.out.println("child exception class");
    }
}
public class CompiletimeCompiletime {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
