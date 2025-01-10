class A{
    void show1(){
        String s=null;
        System.out.println(s.length());
    }
    void show2(){
        show1();
    }
    void show3(){
        show2();
    }
}

public class RuntimeException3 {
    public static void main(String[] args) {
        try {
            A p=new A();
            p.show3();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("exception handle");
        }
    }
}
