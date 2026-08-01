public class binary{

    //Binary to decimal
    public static void binTodec(int binNum){
         int cont = binNum;
         int pow = 0;
         int decNum = 0;

         while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
         }

         System.out.println("decimal of " + cont + " = " + decNum);
    }


    //Decimal to binary
    public static void decToBin(int decNum){
        int myNum = decNum;
        int t = 1;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + rem * t;
            t *= 10;
            decNum = decNum / 2;

        }

        System.out.println("binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args){
        binTodec(101);
        decToBin(16);

    }
}
