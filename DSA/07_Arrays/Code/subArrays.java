import java.util.Scanner;
public class subArrays{


    //[1Q] Printing Subarrays
    public static void printSubArr(int arr[]){
        int ts = 0;
        for(int i = 0; i < arr.length; i++){  // for starting element
            for(int j = i; j < arr.length; j++){ // for last element in the subarray
                for(int k = i; k <= j; k++){    // for printing the elements between starting and ending elements which is our subarray
                    System.out.print(arr[k] + " ");
                }

                ts++;
                System.out.println();
            }

            System.out.println();

        }

        System.out.println("total subarrays = " + ts);
    }



    //[2Q] max and min sum of subarray

    //max sum (used Brute force)
    public static void maxSum(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];

                }

                System.out.println(sum);

                if(max < sum){
                    max = sum;
                }

                sum = 0;
            }
        }

        System.out.println("max sum = " + max);


    }



    //min sum (used Brute force)
    public static void minSum(int arr[]){
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }

                System.out.println(sum);
                if(min > sum){
                    min = sum;
                }

                sum = 0;
            }
        }

        System.out.println("min sum = " + min);
    }






    public static void main(String args[]){
        int nums[] = {2, 4, 6, 8, 10};


        //[1Q] Printing Subarrays
        printSubArr(nums);


        //[2Q] min and max sum of subarray
        maxSum(nums);
        minSum(nums);
        //NOTE : Time Complexity = O(n^3) which is very bad and unomptimised (used Brute force)

    }

}
