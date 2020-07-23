package MethodsReturningValues;

public class MethodRetuningArray {


    // here i will crate methods returning single and 2 d array with int

    // Homework : you have to try - sindle dimentional 2d array
/*    1. double -array
    2. char - array
    3. string - array*/


    int[] getmyarray()
    {
        int[] a = {45,34,56,76,98};

        return  a;
    }

    int[][] getMy2DArray()
    {
        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};

        return  a;

    }


    public static void main(String[] args) {

        MethodRetuningArray ob = new MethodRetuningArray();

        int[] a1 = ob.getmyarray();

     /*   for(int i =0 ;i < a1.length; i++)
            System.out.println(a1[i]);*/

      /*  for(int i =0 ;i < ob.getmyarray().length; i++)
            System.out.println(ob.getmyarray()[i]);
        */
        int[][] a2 = ob.getMy2DArray();

        /*for(int i=0;i<a2.length;i++)
        {
            for (int j=0;j<a2[0].length;j++)
            {
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
*/

        for(int i=0;i<ob.getMy2DArray().length;i++)
        {
            for (int j=0;j<ob.getMy2DArray()[0].length;j++)
            {
                System.out.print(ob.getMy2DArray()[i][j]+" ");
            }
            System.out.println();
        }



    }





}
