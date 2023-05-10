package S3_02_N1;

public class Observer2 extends Observer{

    public Observer2 (Observable_BankAgent bankAgent){
        this.bankAgent = bankAgent;
        this.bankAgent.add(this);
    }

    @Override
    public void update() {
        System.out.println("Observer 2: " + bankAgent.getState());
    }
}
