package PaymentServices;

public interface OrderService {
    void onSiteOrderRegister(String customerName);
    void onSiteOrderPayment(int foodPrice);
    void onlineOrderRegister(String customerName);
    void onlineOrderPayment(int foodPrice);
    void phoneOrderRegister(String customerName);
    void phoneOrderPayment(int foodPrice);

}
