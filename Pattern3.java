 /**              Floyd's triangle
  *                     1
  *                     2  3
  *                     4  5  6
  *                     7  8  9  10
  *                     11 12 13 14 15
  */

 class Pattern3{
    public static void main(String[] args){
        int i,j, count=0;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
 }