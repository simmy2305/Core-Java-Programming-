public class Sumof2Darray {
    public static void main(String[] args) {
        int a[][]={{12,45,67},{23,9,13},{56,34,21}};
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
             if(a[i][j]>max){
              max=a[i][j];
             }
            }
        }
        System.out.println("maximum element of array is : "+max);
    }
}
