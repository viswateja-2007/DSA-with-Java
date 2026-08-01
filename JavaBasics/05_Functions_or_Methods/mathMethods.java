public class mathMethods{
    public static void main(String args[]){

    int a = 4;
    int b = 2;
    int c = -18;

    int min = Math.min(a , b);
    int max = Math.max(a , b);
    int sqrt = (int)Math.sqrt(a);
    int pow = (int)Math.pow(a , b);
    int abs = Math.abs(c);

    System.out.println("minimum = " + min);
    System.out.println("maximum = " + max);
    System.out.println("square root = " + sqrt);  //Returns the correctly rounded positive square root of a double value.
    System.out.println("power value = " + pow); //Returns the value of the first argument raised to the power of the second argument.
    System.out.println("absolute value = " + abs); //coverts negative value to positive
    }
}
