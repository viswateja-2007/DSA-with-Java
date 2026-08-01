import java.util.Scanner;
public class input{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);


    String name = sc.next();
    System.out.println(name);

    String name1 = sc.nextLine();
    System.out.println(name1);


    //[1Q] sum using input function
    System.out.print("Enter value of a: ");
    int a = sc.nextInt();

    System.out.print("Enter value of b: ");
    int b = sc.nextInt();

    int sum = a + b;

    System.out.println("sum: " + sum);



    //[2Q] product using input function
    int mul = a * b;

    System.out.println("mul: " + mul);



    //[3Q] area of cirlce
    System.out.print("enter radius of circle: ");
    float r = sc.nextInt();

    float area = 3.14f*r*r;

    System.out.println("area of circle is: " + area);


    }
}
