public class Transposein2Darray {

    public static void printn(int arr[][]){
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
         System.out.print(arr[i][j]+" ");
        }
        System.out.println();     
      }
    }
    public static void transpose(int a[][]){
      int trans[][]=new int[3][3];
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
         trans[i][j]=a[j][i];
        }
      }
      printn(trans);
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        transpose(a);
    }
}
