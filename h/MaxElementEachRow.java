public class MaxElementEachRow {
    public static void main(String[] args) {
        int a[][]={{2,4,5},{56,34,78},{22,48,9}};
        for(int i=0;i<a.length;i++){
            int max=0;
            for(int j=0;j<3;j++){
               for(int k=0;k<a[i].length;k++){
                 if(a[i][k]>max){
                   max=a[i][k];
                 }
               }
            }
            System.out.println(max);
        }
        
    }
}
