import java.util.*;
class InputMismatchedException1 extends Exception{
   public InputMismatchedException1(String message ){
     System.out.println(message);
   }
   public static void method(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number : ");
    if(sc.hasNextInt()){
        int number=sc.nextInt();
        System.out.println("Entered a integer : "+number);
    }
    else{
        try {
           throw new InputMismatchedException1("Input mismatched exception");
        } catch (Exception e) {
        System.out.println("Exception handle");
        }
    }
}
}

public class InputMismatchedException {
    public static void main(String[] args) {
        InputMismatchedException1.method();
    }
}
 