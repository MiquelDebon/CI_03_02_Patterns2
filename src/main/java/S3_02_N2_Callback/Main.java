package S3_02_N2_Callback;

    //References: https://www.baeldung.com/java-callback-functions
public class Main {
    public static void main(String[] args) {
        Sale sale00 = new Sale(new CreditPayment());
        Sale sale01 = new Sale(new PaypalPayment());
        Sale sale02 = new Sale(new BankMortagePayment());

    }
}
