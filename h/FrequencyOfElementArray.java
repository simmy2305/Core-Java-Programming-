import java.util.*;
public class FrequencyOfElementArray {
    public static void main(String[] args) {
        int frequency=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row of an array : ");
        int rw=sc.nextInt();
        System.out.println("Enter the column of an array : ");
        int col=sc.nextInt();
        int arr[][]=new int[rw][col];
        System.out.println("Enter the values of array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter a number to find frequency : ");
        int num=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if(num==arr[i][j]){
                frequency++;
               }
            }
        }

        System.out.println("Frequency of  "+num+" is : "+frequency);
           
        }        
    }

