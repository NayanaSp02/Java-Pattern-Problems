//          * * * * * * * * * * 
//          * * * *     * * * * 
//          * * *         * * * 
//          * *             * * 
//          *                 * 
//          *                 * 
//          * *             * * 
//          * * *         * * * 
//          * * * *     * * * * 
//          * * * * * * * * * * 


import java.util.Scanner;

class Patteren6 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=5; j++) {
                if(j<=6-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(j=1; j<=5; j++) {
                if(j>=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(i=1; i<=5; i++) {
            for(j=1; j<=5; j++) {
                if(j<=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(j=1; j<=5; j++) {
                if(j>=6-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}