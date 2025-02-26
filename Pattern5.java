/**          
 *                        - * * * * * * * * * 
 *                        - - * * * * * * * 
 *                        - - - * * * * * 
 *                        - - - - * * * 
 *                        - - - - - * 
 */

class Pattern5{
    public static void main(String[] args){
        int i,j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++){
                System.out.print("- ");
            }
            for(j=1; j<= 11-2*i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/**               when n =5
 * 
 *                        - * * * * * * * * * 
 *                        - - * * * * * * * 
 *                        - - - * * * * * 
 *                        - - - - * * * 
 *                        - - - - - * 
 */


import java.util.Scanner;
class Pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("enter n: ");
        int n=sc.nextInt();

        for(i=1; i<=n; i++) {
            for(j=1; j<=i; j++){
                System.out.print("- ");
            }
            for(j=1; j<= (2*n+1)-2*i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}