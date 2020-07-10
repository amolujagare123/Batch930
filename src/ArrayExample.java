public class ArrayExample {

    public static void main(String[] args)
    {
       int[] a = new int[5];

       a[0] = 10; // even
       a[1] = 23;// odd
       a[2] = 20;// even
       a[3] = 7;// odd
       a[4] = 77;// odd


     //   System.out.println(a[3]);

       int arrayLength =  a.length;

        System.out.println("Array Length:"+arrayLength);
      /*for(int i=0; i<5 ;i++)
       {
           System.out.println(a[i]);
       }
*/
        for(int i=0; i<a.length ;i++)
        {
            System.out.println(a[i]);
        }


      /*

       declare an array (int)  of size 10 , put values in to it
       print the values - with even or odd infromt of it

      * */


    }

}
