package PaymentServices;

public class PhoneOrderService implements OrderService{
    @Override
    public void onSiteOrderRegister(String customerName) {
        System.out.println("on-Site order registered for " + customerName);
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {
        System.out.println("Online Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void onlineOrderRegister(String customerName) {
        System.out.println("Online order registered for " + customerName);
    }

    @Override
    public void onlineOrderPayment(int foodPrice) {
        System.out.println("on-Site Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void phoneOrderRegister(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    @Override
    public void phoneOrderPayment(int foodPrice) {
        System.out.println("Phone Payment with Price : " + foodPrice + " Tomans!");
    }
}
