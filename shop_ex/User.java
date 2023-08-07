package shop_ex;

public class User {
    private String name;
    private PayType payType;
    public User(String name, PayType payType){
        this.name = name;
        this.payType = payType;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public PayType getPayType(){
        return payType;
    }
    public void setpayType(PayType payType){
        this.payType = payType;
    }
    
}
