public class FactiorialDemo {

    public static void main(String[] args) {

        int n =6;
        int multiply=1;

        for (int i = n ; i>=1 ;i--)
        {
          multiply = multiply * i;
        }

        System.out.println(multiply);
    }
}
