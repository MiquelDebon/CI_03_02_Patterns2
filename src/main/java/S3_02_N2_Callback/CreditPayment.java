package S3_02_N2_Callback;

public class CreditPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("💰Paid by Credit Card");
    }
}
