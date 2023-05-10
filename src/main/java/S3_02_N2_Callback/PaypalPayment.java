package S3_02_N2_Callback;

public class PaypalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("🛜Paid by Paypal - Modernillo ");
    }
}
