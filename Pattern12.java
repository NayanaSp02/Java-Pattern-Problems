//                    A
//                    b C
//                    d E f
//                    G h I j
//                    K l M n O


class Pattern12 {
    public static void main(String[] args) {
        int i, j, count=0;
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++) {
                count++;
                if( count%2 == 1 ) {
                    System.out.print((char)(64+count)+" ");
                } else {
                    System.out.print((char)(96+count)+" ");
                }
            }
            System.out.println();
        }
    }
}
