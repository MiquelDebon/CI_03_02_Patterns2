package S3_02_N2_Callback;

public class Sale {
    private Payment payment;
    public Sale(Payment paymentType){ //Interface as a Parameter
        this.payment = paymentType;
        payment.pay();                  //synchronous method
    }



}
