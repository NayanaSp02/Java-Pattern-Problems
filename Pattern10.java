//           A  B C D E 
//           A  B C D 
//           A  B C
//           A  B 
//           A 

class Pattern9{
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=6-i; j++) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}