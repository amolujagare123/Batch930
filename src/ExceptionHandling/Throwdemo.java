package ExceptionHandling;

public class Throwdemo {


    void mymethod(int n) throws Exception // number must be beween 1 to 10 if not thow some excetion
    {
        if(n>=1 && n<=10)
            System.out.println(n+" This number is in between 1-10");
        else
            throw new Exception("Number is not in between 1-10");

    }


    public static void main(String[] args) throws Exception {

        Throwdemo ob = new Throwdemo();

        //try {

            ob.mymethod(11);
       /* }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/
        System.out.println("This is the last statement");

    }
}
