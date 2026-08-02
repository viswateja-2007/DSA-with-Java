import java.util.Scanner;
public class searchAlgo{

        //linear search

        //apna college version
        public static int linearSearch(int arr[], int num){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == num){
                    return i;
                }

            }

           return -1;

        }



        //largest number in array
        public static int arrLargest(int arr[]){
            int max = Integer.MIN_VALUE;   //-infinity        // Integer.MIN_VALUE and Integer.MAX_VALUE comes under java.util.Scanner or java.util.*

            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }

            }

            return max;
        }


        //my version
        public static void arrLargest1(int arr[]){
            int max = arr[0];
            for(int i = 1; i < arr.length; i++ ){
                if(arr[i] > max){
                    max = arr[i];
                }

            }

            System.out.println("Largest element in the array is = " + max);
            System.out.println();

        }




        //Binary Search (Important for INTERVIEWS)  //please dry run this code to understand perfectly

        public static int binarySearch(int arr[], int key){
            int start = 0;
            int end = arr.length - 1;

            while(start <= end){

                int mid = (start + end) / 2;
                if(arr[mid] == key){  //found
                    return mid;
                }

                if(key < arr[mid]){  //left half condition         //if used as every time this condition must be checked
                    end = mid - 1;
                } else{              //right half condition
                    start = mid + 1;
                }
            }

            return -1;
        }





        public static void main(String args[]){


            //linear search
            int nums[] = {2, 4, 6, 8, 10, 12, 14, 16};
            int key = 6;
            int index = linearSearch(nums, key);

            if(index == -1){
                System.out.println(key + " doesnot exist in nums");
            }

            else{
                System.out.println(key + " is located at index " + index);
            }



            //largest number in array

            //apna college version
            int large = arrLargest(nums);
            System.out.println("largest number in array is = " + large);


            //my version
            arrLargest(nums);

            //binary search
            int key1 = 2;
            int binIndex = binarySearch(nums, key1);

            if(binIndex == -1){
                System.out.println(key1 + " doesnot exist in nums");
            }

            else{
                System.out.println(key1 + " is located at index " + binIndex);
            }
    }

}
