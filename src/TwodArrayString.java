public class TwodArrayString {

    public static void main(String[] args) {
        String[][] stArr = {{"abc0","pqr0","xyz0"},{"abc1","pqr1","xyz1"},{"abc2","pqr2","xyz2"},{"abc3","pqr3","xyz3"}};

        for (int i=0;i<stArr.length;i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }





    }
}
