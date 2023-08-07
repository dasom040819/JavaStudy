package shop_ex;

public class ShopLaunchaer {
    public static void main(String[] args){
        IShop shop = new Myshop();
        shop.SetTitle("MyShop");
        shop.genUser();
        shop.genProduct();
        shop.start();
    }
}
