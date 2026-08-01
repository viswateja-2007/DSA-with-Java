import java.util.Scanner;
public class ternary_op{
    public static void main(String[] args){

    int n = 4;

    Scanner sc = new Scanner(System.in);

    //ternary operator

    String type = ((n % 2) == 0)? "even":"odd";
    System.out.println(type);


    //[1Q] pass or fail
    System.out.print("enter your marks: ");
    int marks = sc.nextInt();

    String result = (marks >= 33)? "pass":"fail";
    System.out.println(result);




    }
}
