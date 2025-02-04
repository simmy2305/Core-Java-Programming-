class A{
   public static void main(){
      String name=null;
      System.out.println(name.length());
   }
   
}
public class NullPointerExceptionHandling {
   public static void main(String[] args) {
      try {
        A.main();
      } catch (Exception e) {
        System.out.println("Null pointer exception handled");
        System.out.println(e);
      }
   } 
}
