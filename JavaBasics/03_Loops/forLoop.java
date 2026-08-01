public class forLoop{
    public static void main(String[] args){



        //SYNTAX
        //for(initialization; condition; updation){
        //     work
        // }



        //[1Q] Square pattern using for forLoop
        for(int i = 0; i < 4; i ++){
            System.out.println("* * * *");

        }



        //[2Q] print reverse of a number
        int n = 25207;
        while(n > 0){
            int lastDigit = n % 10;
             n = n / 10;

            System.out.print(lastDigit);
        }

        System.out.println();




        //[3Q] reverse the given number (change the orginal number)
        int n1 = 25207;
        int rev = 0;

        while(n1 > 0){
            int digit = n1 % 10;
            rev = (rev * 10) + digit;
            n1 = n1 / 10;


        }

        System.out.println(rev);



    }
}
