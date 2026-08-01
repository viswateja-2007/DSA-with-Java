public class patterns{


    //[1Q]Print Hollow Rectangle

        //pattern:
        // * * * * *
        // *       *
        // *       *
        // * * * * *


    public static void hollowRect(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == 1 || i == rows || j == 1 || j ==        cols){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }



    //[2Q] Inverted & Rotated half-pyramid

        //pattern
        //       *
        //     * *
        //   * * *
        // * * * *



    //easy using two inner loops and apna college version
    public static void irhPyra1(int n){
        for(int i = 1; i <= n; i++){

            //spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    //my version
    public static void irhPyra(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(j <= cols - i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }




    //[3Q] Iverted half pyramid with numbers

        //patterns
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

    public static void nhPyra(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - (i - 1); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }




    //[4Q] Floyds Triangle

        //Pattern
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15



    public static void floyd(int n){
        int count= 1; //declared a value
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }


    //[5Q] 0-1 Traingle

        //Pattern
        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1

        public static void tra(int n){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    if((i + j) % 2 == 0){
                        System.out.print(1  + " ");
                    }
                    else{
                        System.out.print(0 + " ");
                    }
                }

                System.out.println();
            }
        }


        //[6Q] Butterfly pattern

            //Pattern
            // *             *
            // * *         * *
            // * * *     * * *
            // * * * * * * * *
            // * * * * * * * *
            // * * *     * * *
            // * *         * *
            // *             *


        //apna college version
        public static void Butterfly(int n){

            //upper half pattern
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                for(int j = 1; j <= 2*n - 2*i; j++){
                    System.out.print(" ");
                }

                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

            //lower half pattern
            for(int i = n; i >= 1; i--){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                for(int j = 1; j <= 2*n - 2*i; j++){
                    System.out.print(" ");
                }

                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                System.out.println();
            }




        }


        //my version
        public static void Butterfly1(int n){

            //upper half pattern
            for(int i = 1; i <= n; i++){

                //stars
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                //spaces
                for(int j = 1; j <= 2*n - 2*i; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

            //lower half pattern
            for(int i = 1; i <= n; i++){

                //stars
                for(int j = 1; j <= (n + 1) - i; j++){
                    System.out.print("*");
                }

                //spaces
                for(int j = 1; j <= 2*i - 2; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j = 1; j <= (n + 1) - i; j++){
                    System.out.print("*");
                }

                System.out.println();

            }
        }


        //[7Q] Solid Rhombus

            //Pattern
            //         * * * * *
            //       * * * * *
            //     * * * * *
            //   * * * * *
            // * * * * *


        public static void solidRhombus(int n){
            for(int i = 1; i <= n; i++){

                //spaces
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j = 1; j <= n; j++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }


        //[8Q] Hollow Rhombus

            //Pattern
            //         * * * * *
            //       *       *
            //     *       *
            //   *       *
            // * * * * *



        public static void hollowRhombus(int n){
            for(int i = 1; i <= n; i++){

                //spaces
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                //hollow rectangle code
                for(int j = 1; j <= n; j++){

                    //stars
                    if(i == 1|| i == n || j == 1 || j == n){
                        System.out.print("*");
                    }

                    //spaces
                    else{
                        System.out.print(" ");
                    }
                }

                System.out.println();

            }
        }


        //[9Q] Diamond

            //Pattern
            //       *
            //     * * *
            //   * * * * *
            // * * * * * * *
            // * * * * * * *
            //   * * * * *
            //     * * *
            //       *



        public static void diamond(int n){
            for(int i = 1; i <= n; i++){

                //spaces
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j = 1; j <= 2*i - 1; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

            for(int i = n; i >= 1; i--){

                //spaces
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j = 1; j <= 2*i - 1; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

        }


        //[10Q]Number pyramid

            //Pattern
            //     1
            //    2 2
            //   3 3 3
            //  4 4 4 4
            // 5 5 5 5 5

        public static void numberPyramid(int n){
            for(int i = 1; i <= n; i++){

                //space
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                //numbers
                for(int j = 1; j <= i; j++){
                    System.out.print(i + " ");
                }

                System.out.println();
            }
        }



        //[11Q]Palindrome Pyramid

            //Pattern
            //     1
            //    212
            //   32123
            //  4321234
            // 543212345

        public static void palindromePyramid(int n){
            for(int i = 1; i <= n; i++){

                //spaces
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }


                //     1
                //    21
                //   321
                //  4321
                // 54321
                for(int j = i; j >= 1; j--){
                    System.out.print(j);
                }


                //
                //      2
                //      23
                //      234
                //      2345
                for(int j = 2; j <= i; j++){
                    System.out.print(j);
                }

                System.out.println();
            }

        }

    public static void main(String args[]){

        //[1Q] Hollow Rectangle
        hollowRect(4, 5);


        //[2Q] Inverted & Rotated half-pyramid
        //my version
        irhPyra(4, 4);
        //easy using two inner loops and apna college version
        irhPyra1(4);


        //[3Q] Inverted half pyramid with numbers
        nhPyra(4);


        //[4Q] Floyds Triangle
        floyd(5);


        //[5Q] 0-1 Triangle
        tra(5);


        //[6Q] Butterfly
        Butterfly(5);
        Butterfly1(5);


        //[7Q] Solid Rhombus
        solidRhombus(5);


        //[8Q] Hollow Rhombus
        hollowRhombus(5);


        //[9Q] Diamond
        diamond(4);


        //[10Q] Number Pyramid
        numberPyramid(6);


        //[11Q] Palindrome Pyramid
        palindromePyramid(5);

    }


}
