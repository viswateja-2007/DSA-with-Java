import java.util.Scanner;
public class elseif{
    public static void main(String[] args){

        int age = 18;

        if(age >= 18){
            System.out.println("ADULT");
        }
        else if(age < 18 && age >= 13){
            System.out.println("TEENAGER");
        }
        else{
            System.out.println("CHILD");
        }


        Scanner sc = new Scanner(System.in);


        //[1Q] Income tax calculator
        System.out.print("enter your salary: ");
        int sal = sc.nextInt();
        float tax;


        if(sal < 500000){
            tax = 0;
        }
        else if(sal >= 500000 && sal < 1000000){
            tax = 20;
        }
        else{
            tax = 30;
        }

        float incTax = (tax/100)*sal;
        System.out.println("you have to pay RS " + incTax + " as tax" );



        //[3Q] print largest of 3 numbers
        System.out.print("enter a: ");
        int a = sc.nextInt();

        System.out.print("enter b: ");
        int b = sc.nextInt();

        System.out.print("enter c: ");
        int c =sc.nextInt();


        if(a > b && a > c){
            System.out.println(a + " is largest of 3 numbers");
        }
        else if(b > c){
            System.out.println(b + " is largest of 3 numbers");
        }
        else{
            System.out.println(c + " is largest of 3 numbers");
        }

















    }

}
