package AbStractclassNInterfaces;

public interface Interfacedemo2 {

    void display();

}


interface  Interfacedemo3
{

    void display();

}


class ChildInterface implements Interfacedemo2,Interfacedemo3
{

  public void  display() {
     System.out.println("display");

 }

    public static void main(String[] args) {

        Interfacedemo2 i2 = new ChildInterface();
        i2.display();

        Interfacedemo3 i3 = new ChildInterface();

        i3.display();
    }


}
