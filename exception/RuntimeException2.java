class A{
    void show1(){
        String s=null;
        System.out.println(s.length());
    }
    void show2(){
        show1();
    }
    void show3(){
        try {
            show2();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("exception handle");
        }
    }
}
public class RuntimeException2 {
    public static void main(String[] args) {
        A p=new A();
        p.show3();
    }
}
