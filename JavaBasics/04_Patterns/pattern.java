public class pattern{
    public static void main(String[] args){


        //[1Q] Star pattern

            //pattern:
                //*
                //* *
                //* * *
                //* * * *

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();

        }



        //[2Q] Inverted Star pattern

            //pattern:
                //* * * *
                //* * *
                //* *
                //*

        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n + 1) - i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }



        //[3Q] Half-Pyramid pattern

            //pattern
                //1
                //1 2
                //1 2 3
                //1 2 3 4


        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }



        //[4Q] Character pattern

            //Pattern
                //A
                //B C
                //D E F
                //G H I J

        char ch = 'A';
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }








    }
}
