/**               simple pyramid or equilateral triangle
 *                        - - - - - * 
 *                        - - - - * * * 
 *                        - - - * * * * * 
 *                        - - * * * * * * * 
 *                        - * * * * * * * * * 
 */

class Pattern4{
    public static void main(String[] args){
        int i,j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=6-i; j++){
                System.out.print("- ");
            }
            for(j=1; j<= i*2-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}