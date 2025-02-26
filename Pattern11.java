//                    A
//                    1 2
//                    A B C
//                    1 2 3 4
//                    A B C D E


class Pattern11 {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++) {
                if( i%2 == 0 ) {
                    System.out.print(j+" ");
                } else {
                    System.out.print((char)(64+j)+" ");
                }
            }
            System.out.println();
        }
    }
}
