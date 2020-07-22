package ClassExample;

public class Bank {

    void rateOfInterest()
    {
        System.out.println("Bank: 5 %");
    }

    public static void main(String[] args) {
        Bank b = new Axis();
        b.rateOfInterest();

        b  = new ICICT();
        b.rateOfInterest();

        b = new SBI();
        b.rateOfInterest();

    }

}

class Axis extends  Bank
{

    void rateOfInterest()
    {
        System.out.println("Bank: 5.2 %");
    }
}

class ICICT extends  Bank
{

    void rateOfInterest()
    {
        System.out.println("Bank: 4.9 %");
    }
}

class SBI extends  Bank
{

    void rateOfInterest()
    {
        System.out.println("Bank: 4.8 %");
    }
}
