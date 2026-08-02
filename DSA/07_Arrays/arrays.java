import java.util.Scanner;
public class arrays {
    public static void main(String args[]){
        //SYNTAX
        //CREATE:
        //dataType arrayName = new dataType[size];

        int marks[] = new int[50];  



        //manual way
        String anime[] = {"One Piece", "Naruto", "Bleach"};


        //INPUT/OUTPUT:
        Scanner sc = new Scanner(System.in);

        //manually
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();


        System.out.println("phy : " + marks[0]);
        System.out.println("math : " + marks[1]);
        System.out.println("chem : " + marks[2]);


        //note: arrays lenght
        //syntax = name.lenght

        System.out.println("lenght : " + anime.length);

        sc.close();
    }

}
