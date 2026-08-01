import java.util.Scanner;
public class sample{

    //[1Q]Product of a and b
    public static int product(int a, int b){
        int mul = a * b;
        return mul;
    }



    //[2Q]factorial
    public static int fact(int n){
        int fact = 1;

        for(int i = 1; i <= n; i++){
                fact = fact * i;
        }

        return fact;
    }



    //[3Q]Binomial coefficient (nCr)

    //factorial functions acts as an helper function here

    public static int binCoff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n - r);

        int bin = n_fact/(r_fact * nmr_fact);
        return bin;
    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //[1Q]Product of a and b
        int a = 10;
        int b = 5;
        int c = product(a, b);
        System.out.println("product of " + a + " x " + b + " = "+ c);



        //[2Q]factorial
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println("factorial of " + n + " = " + f);



        //[3Q]binomial coefficient
        int x = binCoff(5, 2);
        System.out.println("5C2 : " + x);






    }
}
