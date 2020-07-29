package pack2;

public class MthodReturningObjet {

    java4 setMyObject()
    {
        java4 obj = new java4();
        obj.i4 =78;
        obj.d4 = 89.7;
        obj.c4 = 'g';
        obj.str4="shweta";
        return  obj;
    }

    public static void main(String[] args) {

        java4 ob = new java4();
        ob.display4();

        MthodReturningObjet myMethodObj = new MthodReturningObjet();
        ob = myMethodObj.setMyObject();
        ob.display4();

    }




}
