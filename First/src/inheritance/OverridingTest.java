package inheritance;

public class OverridingTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Les");
        int price = customerLee.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "원이고, " + customerLee.showCustomerInfo());

        Customer customerKim = new VIPCustomer(10011, "Kim", 100);
        price = customerKim.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "원이고, " + customerKim.showCustomerInfo());

    }
}
