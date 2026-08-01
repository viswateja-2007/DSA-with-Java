import java.util.Scanner;
public class syntax{
    //non parameterised
    //returnType name(){
           //body
    //}


    public static void helloWorld(){
        System.out.println("Hello World!");
    }



    //parameterised
    //returnType name(type param1, type param2){
            //body
            //return statement;
    //}


    public static int sum(int a, int b){   // a and b are formal parameters
        int sum = a + b;
        return sum;
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        helloWorld();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sum(a, b); // a and b are actual parameters
        System.out.println(s);

    }
}
