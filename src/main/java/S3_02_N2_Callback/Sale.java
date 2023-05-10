package S3_02_N2_Callback;

public class Sale {
    private Payment payment;
    private double amount;
    public Sale(Payment paymentType, double amount){ //Interface as a Parameter
        this.payment = paymentType;
        this.amount = amount;
        payment.pay();                  //synchronous method
    }


    public double getAsynchronousAmount(){
        return  amount;
    }

}
