public class EvenOddArray {

    public static void main(String[] args) {
       /* int[] a = new int[5];

        a[0] = 10; // even
        a[1] = 23;// odd
        a[2] = 20;// even
        a[3] = 7;// odd
        a[4] = 77;// odd*/

        int[] a = {23,45,656,768,32,3233,21,2,4,656};


        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]+" even");
            else
                System.out.println(a[i]+" odd");
        }

    }

}
