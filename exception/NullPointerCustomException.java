class A extends Exception{
    public A(String message){
     System.out.println(message);
    }
}
class B{
    public static void CustomException(String name){
        if(name==null){
           try {
              throw new A("Null pointer exception");        
          } catch (Exception e) {
              System.out.println(e);
           }
        }
      }
}
public class NullPointerCustomException {
    public static void main(String[] args) {
        B.CustomException(null);
    }
}
