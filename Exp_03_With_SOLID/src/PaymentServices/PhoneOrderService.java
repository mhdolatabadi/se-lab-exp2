package Exp_03_With_SOLID.src.PaymentServices;

import PaymentServices.OrderService;

public class PhoneOrderService implements NewOrderService {
    @Override
    public void Register(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    @Override
    public void Payment(int foodPrice) {
        System.out.println("Phone Payment with Price : " + foodPrice + " Tomans!");
    }
}
