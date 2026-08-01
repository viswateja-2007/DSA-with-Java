public class arrays_as_args{

    //Passing array as arguments in a function:

    //arrays follow PASS BY REFERENCE concept which states that when passing a array in function, 
    // it doesnot pass array as copy of orginal array (like variables which follow PASS BY VALUE) 
    // actually the orginal array is passed and changes occured by applying the function also occurs
    // in original array. 

    // In simple words changes directly reflect in orginal array.


    public static void update(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String args[]){


        int marks[] = {97, 98, 99};
        update(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
