public class TwoDArray {

    public static void main(String[] args) {

        int[][] b = new int[4][3]; // ( 4 rows & 3 columns )

        b[0][0] =34;
        b[0][1] =23;
        b[0][2] =22;

        b[1][0] =35;
        b[1][1] =24;
        b[1][2] =21;

        b[2][0] =36;
        b[2][1] =21;
        b[2][2] =29;


        b[3][0] =31;
        b[3][1] =21;
        b[3][2] =27;


        int row = b.length;
        System.out.println("row:"+row);
        int col = b[0].length;
        System.out.println("col:"+col);


       /* for(int i =0 ; i<4 ;i++)
        {
            for(int j=0; j<3;j++) {
                System.out.print(b[i][j]+" ");
            }

            System.out.println();
        }*/

        for(int i =0 ; i<b.length ;i++)
        {
            for(int j=0; j<b[0].length;j++) {
                System.out.print(b[i][j]+" ");
            }

            System.out.println();
        }

    }

}
