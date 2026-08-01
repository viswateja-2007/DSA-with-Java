public class basicQues{

    //[1Q] reverse an array
    //my version (using for loop, still optimal but doesnot use start and end explicitly)
    public static void reverseArr1(int arr[]){

        int n = arr.length;
        for(int start = 0; start < n/2 ; start++){

            int end = (n - 1) - start;

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

        }


    }


    //apna college version (using while loop, with explicitly using start and end) prefered most
    public static void reverseArr(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    //NOTE: Time complexity of both methods is O(n) and Space complexity is O(1)




    //[2Q] Pairs in an array


        //sample output
        // (2, 4) (2, 6) (2, 8) (2, 10)
        // (4, 6) (4, 8) (4, 10)
        // (6, 8) (6, 10)
        // (8, 10)


    public static void pairUp(int arr[]){

        int tp = 0;
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            for(int j = i + 1 ; j < arr.length; j++){
                System.out.print("(" + current + ", " + arr[j] + ") ");
                tp++;
            }

            System.out.println();

        }

        System.out.println("total pairs = " + tp);  //NOTE : may be asked in interviews u can use tp = (n - 1)n / 2
    }

    public static void main(String args[]){


        //[1Q] reverse an array
        int nums[] = {10, 34, 23, 25, 21, 29, 20};

        reverseArr(nums);
        System.out.print("reversed array is : ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        //NOTE : Time complexity : O(n)    Space complexity : O(1)


        //[2Q] Pairs in an array
        int nums1[] = {2, 4, 6, 8, 10};
        pairUp(nums1);
        //NOTE : Time complexity : O(n^2)



    }
}
