package S3_02_N1_Observer;

public class Observer1 extends Observer{
    public Observer1 (Observable_BankAgent bankAgent){
        this.bankAgent = bankAgent;
        this.bankAgent.add(this);
    }

    @Override
    public void update() {
        System.out.println("Observer 1: " + bankAgent.getState());
    }


}
