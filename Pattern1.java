// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/**
 *  output:  
       * * * * * 
         * * * * 
           * * * 
             * * 
               * 
 */
class Pattern1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(j>=i){
                  System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}