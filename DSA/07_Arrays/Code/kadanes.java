import java.util.Scanner;
public class kadanes{
    public static void kadanesAlgo(int arr[]) {       //Kadane's Algorithm maintains a running sum. Whenever this running sum becomes negative,it
        int ms = Integer.MIN_VALUE;                   //resets it to 0 because carrying a negative sum into the next elements can only reduce the sum
        int cs = 0;                                   //of any future subarray. The algorithm continues accumulating values and keeps track of the
                                                      //maximum running sum seen so far.


        for(int i = 0; i < arr.length; i++){          //Example:  in the given array, (cs = 0 beacuse -2 < 0)
                                                      //          cs =  0 | 0 | 4 | 3 | 1 | 2 | 7 | -3 |
            cs = cs + arr[i];                         //          ms =  0 | 0 | 4 | 4 | 4 | 4 | 7 |  7 |
            ms = Math.max(cs, ms);



            //first we will update ms (for arrays which contains only -ve integer )
            //we used this before if statement beacause
            //for arrays with only -ve integer, the ms would return 0, but its not the right answer

            //Example : [-5, -2, -8], answer = 2 (if used before if statement)
            //                        answer = 0 (if used after if statement)


            if(cs < 0){
                cs = 0;
            }                                         //NOTE: Dryrun the code on paper for better understanding
        }

        System.out.println("max sum of subarray = " + ms);
    }

    public static void main(String args[]){
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -4};


        kadanesAlgo(nums);

    }
}
