class A{
    void show1(){
     String s=null;
     System.out.println(s.length());
    }
    void show2(){
        try {
            show1();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("exception handle");
           
        }
    }
    void show3(){
        show2();
    }
}

public class RuntimeException1 {
    public static void main(String[] args) {
        A p=new A();
        p.show3();
    }
}
