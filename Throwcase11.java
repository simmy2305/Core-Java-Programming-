class A {
    public static void method(){
     int a=9/0;
     System.out.println(a);
    }
}

public class Throwcase11 {
    public static void main(String[] args){
        try {
            A.method();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
