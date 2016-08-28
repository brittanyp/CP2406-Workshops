/**
 * Created by jc319715 on 15/08/16.
 */
public class Billing {
    public static void main(String arg[]){
        double price = 100;
        double totalPrice = computeBill(price);
        double totalTaxPrice = computeBill(price, 2);
        double totalTaxCoupPrice = computeBill(price, 2, 0.5);
        System.out.println(totalPrice);
        System.out.println(totalTaxPrice);
        System.out.println(totalTaxCoupPrice);
    }
    public static double computeBill(double price){
        double TAX = 0.08;
        double total;
        total = (TAX * price) + price;
        return total;
    }
    public static double computeBill(double price, double quantity){
        double TAX = 0.08;
        double bookTotal;
        bookTotal = (TAX * price) + price;
        double total = bookTotal * quantity;
        return total;
    }

    public static double computeBill(double price, double quantity, double coupon){
        double TAX = 0.08;
        double bookTotal;
        bookTotal = (TAX * price) + price;
        double total = bookTotal * quantity;
        total = total - (coupon * price);
        return total;
    }
}
