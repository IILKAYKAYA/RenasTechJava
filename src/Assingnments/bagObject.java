package Assingnments;

public class bagObject {

    public static void main(String[] args) {

        bagExeClass bag=new bagExeClass();

        System.out.println(bag.brand); //null
        System.out.println(bag.size); //0
        System.out.println(bag.color); //null
        System.out.println(bag.type); //null

        bag.wear();
        bag.getBagInfo();

        bag.brand="dior";
        bag.size=10;
        bag.color="blue";
        bag.type="Totte";

        System.out.println(bag.brand);
        System.out.println(bag.color);
        System.out.println(bag.size);
        System.out.println(bag.type);

        bag.wear();
        bag.getBagInfo();

        bag.setBagInfo("Gucci","pink","crossBody",12);
        System.out.println(bag);




    }
}
