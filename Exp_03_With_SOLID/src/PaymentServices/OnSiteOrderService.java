package Exp_03_With_SOLID.src.PaymentServices;

import PaymentServices.OrderService;

public class OnSiteOrderService implements NewOrderService {
    @Override
    public void Register(String customerName) {
        System.out.println("on-Site order registered for " + customerName);
    }

    @Override
    public void Payment(int foodPrice) {
        System.out.println("on-Site Payment with Price : " + foodPrice + " Tomans!");
    }
}
