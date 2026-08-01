public class prime{


     public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(primeOpt(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Method 1: normal method
    public static boolean prime(int n){

        boolean isPrime = true;

        //corner case for 2
        if(n == 2){
            return isPrime;
        }

        for(int i = 2; i <= n - 1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }




    //Method 2: optimized version
    public static boolean primeOpt(int n){

        boolean isPrime = true;

        //corner case for 2
        if(n == 2){
            return isPrime;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }



    //Print all primes in range (where n = range)




    public static void main(String args[]){

        boolean y = prime(2);
        System.out.println("is 2 a prime number : " + y);

        boolean x = primeOpt(10);
        System.out.println("is 10 a prime number : " + x);

        primesInRange(10);
    }
}
