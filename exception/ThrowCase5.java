public class ThrowCase5 extends Exception{

    public ThrowCase5(String name){
      System.out.println(name);
    }
    public static void main(String[] args) {
        try {
            throw new ThrowCase5("simran");
        } catch (ThrowCase5 e) {
            System.out.println(e);
        }
    }
}
