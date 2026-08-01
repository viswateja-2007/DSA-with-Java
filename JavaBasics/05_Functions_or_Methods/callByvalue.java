import java.util.Scanner;
public class callByvalue{

    public static void change(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
    public static void main(String args[]){


        int a = 5;
        int b = 10;
        change(a, b);
        System.out.println("a : " + a);
        System.out.println("b : " + b);


        //in java functions operate on call by value in which copy of actual parameters is passed to formal parameters in which changes by the function is occurs in the copy not the orginal values or actual parameters and also

        //remember:
        //java doesnot support call by refernce in which changes occur in actual paramerters, all functions only operate on call by value



    }

}
