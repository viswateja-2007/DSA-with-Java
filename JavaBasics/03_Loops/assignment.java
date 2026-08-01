import java.util.Scanner;
public class questions{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //[1Q] Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        int evenSum = 0;
        int oddSum = 0;
        System.out.print("enter number of integers you want to enter : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++){
            System.out.print("enter number : ");
            int n1 = sc.nextInt();

            if(n1 % 2 == 0){
                evenSum += n1;
            }

            else{
                oddSum += n1;
            }
        }

        System.out.println("sum of even numbers : " + evenSum);

        System.out.println("sum of odd numbers : " + oddSum);



        //[2Q]Write a program to find the factorial of any number entered by the user.

        System.out.print("enter your number : ");
        int n1 = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n1; i ++){
            fact *= i;
        }

        System.out.println("factorial of " + n1 + " is : " + fact);



        //[3Q]Write a program to print the multiplication table of a number N, entered by the user.

        System.out.print("enter your number : ");
        int n2 = sc.nextInt();
        int mul = 1;

        for(int i = 1; i <= 10; i ++){
            mul = n2 * i;
            System.out.println(n2 + " x " + i + " = " + mul);

        }
    }
}
