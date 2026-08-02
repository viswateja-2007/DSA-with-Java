import java.util.Scanner;

public class prefixSum{

   public static void prefixArr(int arr[]){
      int sum = 0;
      int max = Integer.MIN_VALUE;

      //prefix array : which contains cummilative sum of arr element from start (2) to end (4, 6, 8, 10)
      int prefix[] = new int[arr.length];
      prefix[0] = arr[0];

      for(int i = 1; i < prefix.length; i++){
         prefix[i] = prefix[i - 1] + arr[i];
      }

      for(int i = 0; i < arr.length; i++){
         for(int j = i; j < arr.length; j++){
            sum = (i == 0)? prefix[j] : prefix[j] - prefix[i - 1];

            if( max < sum){
               max = sum;
            }
         }
      }
      System.out.println("max sum = " + max);
   }

   public static void main (String args[]){
      int nums[] = {2, 4, 6, 8, 10};
      prefixArr(nums);
   }
}
   

