import java.util.Scanner;

public class if_else{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int age = 19;

    if(age >= 18){
        System.out.println("You are eligible for voting in upcoming election.");
    }

    else{
        System.out.println("You are not an adult!");

    }


    //[1Q] Largest of two numbers
    System.out.print("enter a: ");
    int a = sc.nextInt();

    System.out.print("enter b: ");
    int b = sc.nextInt();

    if(a > b){
        System.out.println("a is largest of 2");
    } else if(a == b){
        System.out.println("a equals to b");
    } else{
        System.out.println("b is largest of 2");
    }


    //[2Q] even or odd
    System.out.print("enter your number: ");
    int a1 = sc.nextInt();

    if(a1 % 2 == 0){
        System.out.println(a1 + " is an even number");
    } else{
        System.out.println(a1 + " is an odd number");
    }






    }


}
