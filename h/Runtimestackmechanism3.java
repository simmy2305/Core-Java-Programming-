class A{
    void show1(){
        int a=9/0;
        System.out.println(a);
    }
    
    void show2(){
        show1();
    }

    void show3(){
        show2();
    }

    void show4(){
        show3();
    }
    void show5(){
        show4();
    }

}

public class Runtimestackmechanism3 {
    public static void main(String[] args) {
        try {
            A p=new A();
            p.show5();
        } catch (ArithmeticException ex) {
            System.out.println("handle");
        }
    }
}
