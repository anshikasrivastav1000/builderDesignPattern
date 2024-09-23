package ProductDesign.BetterCode.v1;

public class Product {

    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;

    Product(){

    }
     public  void setName(String name){
        this.name = name;
     };
    public  void setdesc(String desc){
        this.desc = desc;
    };
    public  void setprice(int price){
        this.price = price;
    }
    public  void setbrand(String brand){
        this.brand = brand;
    };
    public  void setcategory(String category){
        this.category = category;
    };
    public  void setdiscount(int discount){
        this.discount = discount;
    }

}
