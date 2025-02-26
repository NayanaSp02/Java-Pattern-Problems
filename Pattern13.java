//                    1
//                    b 3
//                    D 5 f
//                    7 H 9 j
//                    11 L 13 n 15


class Pattern13 {
    public static void main(String[] args) {
        int i, j, count=0;
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++) {
                count++;
                if( count%2 == 1 ) {
                    System.out.print(count+" ");
                } else if( count%4 == 0 ) {
                    System.out.print((char)(64+count)+" ");
                }
                 else {
                    System.out.print((char)(96+count)+" ");
                }
            }
            System.out.println();
        }
    }
}
