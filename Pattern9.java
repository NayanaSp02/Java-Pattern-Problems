/**                
 *                     1             ------ i=1
 *                     0 1           ------ i=2
 *                     1 0 1         ------ i=3
 *                     0 1 0 1       ------ i=4
 *                     1 0 1 0 1      ------ i=5
 */


class Pattern9{
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++) {
                if(i%2 == j%2) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}