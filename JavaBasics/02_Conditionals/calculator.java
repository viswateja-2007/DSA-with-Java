import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a: ");
        int a = sc.nextInt();

        System.out.print("enter b: ");
        int b = sc.nextInt();

        System.out.print("enter your choice: ");
        char c = sc.next().charAt(0);

        switch(c){
            case '+':
                System.out.println("SUM: " + (a + b));
                break;

            case '-':
                System.out.println("SUB: " + (a - b));
                break;

            case '*':
                System.out.println("MUL: " + (a * b));
                break;

            case '/':
                System.out.print("DIV: " + (a / b));
                break;

            case '%':
                System.out.println("MODULO: " + (a % b));
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
}
