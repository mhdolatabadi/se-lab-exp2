package Exp_03_With_SOLID.src.PaymentServices;

import PaymentServices.OrderService;

public class OnlineOrderService implements NewOrderService {
    @Override
    public void Register(String customerName) {
        System.out.println("online order registered for " + customerName);
    }

    @Override
    public void Payment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }
}
