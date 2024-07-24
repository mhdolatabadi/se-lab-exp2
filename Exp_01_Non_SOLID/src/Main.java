import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.OrderService;
import PaymentServices.PhoneOrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService orderService = null;
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod = 0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1 : Select Order Items
        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }
        }

        //Step2 : Select Payment Method
        while(orderService == null) {
            System.out.println("Enter Your Payment Method (1 for online ,2 for on-site and 3 for phone):");
            customerAnswerForPaymentMethod = scanner.nextInt();
            switch (customerAnswerForPaymentMethod) {
                case 1:
                    orderService = new OnlineOrderService();
                    orderService.onlineOrderRegister(customerName);
                    break;
                case 2:
                    orderService = new OnSiteOrderService();
                    orderService.onSiteOrderRegister(customerName);
                    break;
                case 3:
                    orderService = new PhoneOrderService();
                    orderService.phoneOrderRegister(customerName);
                    break;
                default:
                    System.err.println("wrong number");
            }
        }

        //Step3 : pay price
        System.out.println("Pay Price:");
        switch (orderService) {
            case OnlineOrderService _ -> orderService.onlineOrderPayment(order.getTotalPrice());
            case OnSiteOrderService _ -> orderService.onSiteOrderPayment(order.getTotalPrice());
            case PhoneOrderService _ -> orderService.phoneOrderPayment(order.getTotalPrice());
            default -> {
            }
        }

        //Finally Print Bill
        System.out.println(order);

    }

}
