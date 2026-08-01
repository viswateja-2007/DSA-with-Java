public class questions{
    //[1Q]Write a Java method to compute the average of three numbers.
    public static int average(int a, int b, int c){
        int d = (a + b + c)/3;
        return d;

    }



    //[2Q] Write a method named isEven that accepts an int argument. The methodshould return true if the argument is even, or false otherwise. Also write a program to test your method.
    public static boolean isEven(int n){
        boolean isEven = true;
        if(n % 2 == 0){
            return isEven;
        }

        else{
            return false;
        }

    }



    //[3Q]Write a Java program to check if a number is a palindrome in Java?
    public static void palindrome(int num){
        int temp = num;
        int rev = 0;


        while(temp > 0){
        int lastDigit = temp % 10;
        rev = rev * 10 + lastDigit;
        temp = temp / 10;

        }

        if(num == rev){
            System.out.println(num + " is a palindrome");
        }

        else{
            System.out.println(num + " is not a palindrome");

        }

    }



    //[4Q]Write a Java method to compute the sum of the digits in an integer.
    public static int intSum(int n){
        int temp = n;
        int sum = 0;

        while(temp > 0){
            int lastDigit = temp % 10;
            sum = sum + lastDigit;
            temp = temp / 10;
        }

        return sum;

    }

    public static void main(String args[]){
        //[1Q]
        int n1 = average(8, 9, 7);
        System.out.println("Average = " + n1 );



        //[2Q]
        boolean e = isEven(8);
        System.out.println("is 8 an even number : " + e);



        //[3Q]
        palindrome(1223);


        //[4Q]
        int s = intSum(2007);
        System.out.println("SUM = " + s);
    }
}
