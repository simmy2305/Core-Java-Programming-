import java.util.*;
class A extends Exception{
    public A(String name){
    System.out.println(name);
    }
}
class B{
    public static void marksheet(int marks){
      if(marks<40){
         try {
            throw new A("you are fail");
         } 
         catch (Exception e) {
            System.out.println("exception handle");
         }
      }
      else{
        System.out.println("pass");
      }
    }
}
public class MarksheetThrow {
    public static void main(String[] args) {
        B.marksheet(34);
    }
}
