class A extends Exception{
   public static void voterid(int age){
     if(age<18){
       throw new ArithmeticException("you are not valid");
     }
     else{
        System.out.println("valid");
     }
   }
}
public class ThrowCase7 {
    public static void main(String[] args) {
        A.voterid(3);
    }
}
