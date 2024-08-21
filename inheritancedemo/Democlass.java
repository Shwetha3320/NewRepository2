package inheritancedemo;
class mobileprice
{
    static int showprice(int price)
    {
        System.out.println("Price of the laptop:" +price);
        return price;
    }
}
public class Democlass {
    public static void main(String[] args) {

        mobileprice.showprice(23000);
    }
}
