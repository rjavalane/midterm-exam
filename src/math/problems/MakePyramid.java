package math.problems;

public class MakePyramid {
    public static void printPyramid(int n){
        for (int i=0; i<n; i++){
            for (int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
    }
    }
    public static void main (String [] args){
        int n=6;
        printPyramid(n);
    }
}

     //another methode to do the same
    /*public static void main(String[] args) {

       int n = 10;
       for (int i=0; i<n; i++){
           for (int j=n-i; j>1; j--){
               System.out.print(" ");
           }
           for (int j=0; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }


    }

}*/




        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */



