class A{
    public static void method(){
        int a=9/0;
        System.out.println(a);
    }
}
public class ExceptionBasic4 {
    public static void main(String[] args){
       try {
        A.method();
       } catch (Exception e) {
        System.out.println("exception handle");
        e.printStackTrace();
       }
    }
}
