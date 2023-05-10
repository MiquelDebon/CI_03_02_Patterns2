package S3_02_N2_Callback;

    //References: https://www.baeldung.com/java-callback-functions
public class Main {
    public static void main(String[] args) {

        ShoeShop store = new ShoeShop("MiquelStore");
        store.addSale(new Sale(new CreditPayment(), 34.5));
        store.addSale(new Sale(new PaypalPayment(), 45.1));
        store.addSale(new Sale(new BankMortagePayment(), 100));

        System.out.println("\nLets sum all");
        System.out.println("Total: " + store.calculateTotal());

    }
}
