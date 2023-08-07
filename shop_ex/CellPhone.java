package shop_ex;

public class CellPhone extends Product{
    String carrier;
    public CellPhone(String pname, int princ, String carrier){
        this.pname = pname;
        this.price = princ;
        this.carrier = carrier;
    }
    @Override
    public void printExtra(){
        System.out.println("통신사: "+carrier);
    }
}
