import java.util.Scanner;
public class whileLoop{
    public static void main(String[] args){


        //SYNTAX

        // int i = 0; //initializing
        // while(condition){
        //     --work--
        //     i++
        // }




        //[1Q] print numbers from 1 to 10
        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num ++;
        }
        System.out.println();



        //[2Q] print numbers from 1 to n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i ++;
        }



        //[3Q] sum of first n natural numbers;
        System.out.print("enter number: ");
        int n1 = sc.nextInt();
        int sum = 0;
        int j = 1;

        while(j <= n1){
            sum += j;
            j++;
        }

        System.out.println("sum of first " + n1 + " numbers is: " + sum);


    }

}
