package Assingnments;

public class bagExeClass {


    //instance variable

    String brand;
    int size;
    String color;
    String type;

    public void wear(){
        System.out.println("He/She is wearing "+brand);
    }

    public void size(){
        System.out.println("He/She is wearing size "+size);
    }

    public void getBagInfo(){
        System.out.println(brand+ "," + size+ ","+ color+","+type);
    }
    public void setBagInfo(String bagBrand, String bagColor, String bagType, int bagSize ){

        brand=bagBrand;
        size=bagSize;
        color=bagColor;
        type=bagType;

    }
    public String toString(){

        return brand+'/'+ size+ '/'+ color+ '/' +type;
    }

}
