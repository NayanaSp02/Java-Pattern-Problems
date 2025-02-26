/**                
 *                     1             ------ i=1
 *                     1 0           ------ i=2
 *                     1 0 1         ------ i=3
 *                     1 0 1 0       ------ i=4
 *                     1 0 1 0 1      ------ i=5
 */


class Pattern8{
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++) {
                if(j%2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}