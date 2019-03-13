import java.sql.SQLOutput;

public class Billing {
    public static final double tax=0.08;
    public static double computeBill(double price){
        System.out.println("The Total due "+price*(1+Billing.tax));
        return price*(1+Billing.tax);
    }
    public static double computeBill(double price,int quantity){
        System.out.println("The Total due "+price*quantity*(1+Billing.tax));
        return price*quantity*(1+Billing.tax);
    }
    public static double computeBill(double price,int quantity,int coupon){
        System.out.println("the Total due"+(price*quantity-coupon)*(1+Billing.tax));
        return (price*quantity-coupon)*(1+Billing.tax);
    }
}
