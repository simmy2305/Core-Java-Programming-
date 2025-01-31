class A extends Exception{
  public A(int a){
   System.out.println(a);
  }
}
public class ThrowCase6 {
    public static void main(String[] args) {
        try {
            throw new A(67);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
