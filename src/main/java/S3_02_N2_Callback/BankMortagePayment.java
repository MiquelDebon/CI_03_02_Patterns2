package S3_02_N2_Callback;

public class BankMortagePayment implements Payment{
    @Override
    public void pay() {
        System.out.println("🏦Paid by a bank mortage");
    }
}
