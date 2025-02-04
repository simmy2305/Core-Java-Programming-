public class ArrayIndexOutOfBoundsExceptionHandling {
    public static void main(String[] args) {
        try {
        int a[]={1,2,3,4};
        System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println("Array index out of bounds exception handled");
            System.out.println(e);
        }
        
    }
}
