import java.util.Scanner;
public class questions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //[1Q]  Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is negative");
        }



        //[2Q]Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

        double temp = 103.5;
        if(temp >= 100){
            System.out.println("you got fever!");
        } else{
            System.out.println("you are 100% fine");
        }



        //[3Q]Write a Java program to input week number(1-7) and print day of week name using switch case.

        System.out.print("enter weekday number: ");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid choice");
        }


            //[4Q] Write a Java program that takes a year from the user and print whether that year is a leap year or not.
            System.out.print("enter your year: ");
            int year = sc.nextInt();

            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            }
            else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
            }
            else if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }




    }
}












