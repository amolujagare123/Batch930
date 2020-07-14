public class TwodArrayusingbracket {

    public static void main(String[] args) {

        int[][] b = {{34,23,22 }, {35,24,21 }, {36,21,29 }, {31,21,27}};

        for(int i=0 ; i<b.length ;i++)
        {
            for(int j=0; j<b[0].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }

}
