class A{
    void show1(){
        int a=9/0;
        System.out.println(a);
    }
    void show2(){
        show1();
    }
    void show3(){
        try {
            show2(); 
        } catch (ArithmeticException ex) {
            System.out.println("handle");
        }
    }
}

public class Runtimestackmechanism1 {
    public static void main(String[] args) {
        A p=new A();
        p.show3();
    }
}
