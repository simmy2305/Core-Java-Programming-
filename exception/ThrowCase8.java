class A extends Exception{
    public A(String name){
     System.out.println(name);
    }
}
class B{
    public static void voterid(int age){
        if(age<18){
         try {
          throw new A("simran");
         } catch (Exception e) {
          System.out.println("handle");
         }
        }
        else{
          System.out.println("valid");
        }
      }
}
public class ThrowCase8 {
    public static void main(String[] args) {
       B.voterid(3);
    }
}
