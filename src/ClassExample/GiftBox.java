package ClassExample;

public class GiftBox {

    int almonds;
    int cashew;
    int dryF1;
    int pista;

    void spoon()
    {
        System.out.println("almonds:"+almonds);
        System.out.println("cashew:"+cashew);
        System.out.println("dryF1:"+dryF1);
        System.out.println("pista:"+pista);
    }

    public static void main(String[] args) {

        GiftBox praful = new GiftBox();

        praful.almonds =10 ;
        praful.cashew =7;
        praful.dryF1 =9;
        praful.pista=5;

        praful.spoon();


        GiftBox sandeep = new GiftBox();
        sandeep.pista=2;
        sandeep.cashew=2;
        sandeep.dryF1=2;
        sandeep.almonds=2;

        sandeep.spoon();

    }

}
