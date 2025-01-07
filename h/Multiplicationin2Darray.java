public class Multiplicationin2Darray {

    public static void printn(int arr[][]){
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
         System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
    public static void multplication(int a[][],int r1,int c1,int b[][],int r2,int c2){
        int multi[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
         for(int j=0;j<c2;j++){
          for(int k=0;k<c2;k++){
            multi[i][j]+=a[i][k]*b[k][j];
          }
         }
        }
        printn(multi);
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        multplication(a,3,3,b,3,3);
    }
}
