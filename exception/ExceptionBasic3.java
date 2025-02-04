class A{
    public  static void exception(){
        int a=9/0;
        System.out.println(a);
    }
}
public class ExceptionBasic3 {
    public static void main(String[] args) {
        try {
            A.exception();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
