public class Largestrowsum {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<3;j++){
            sum=sum+a[i][j];
            }
            if(sum>max){
              max=sum;
            }
            System.out.println(sum);
        }
        System.out.println("maximum sum of row is : "+max);
    }
}
