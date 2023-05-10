package S3_02_N1_Observer;

public abstract class Observer {
    protected Observable_BankAgent bankAgent;
    public abstract void update();
}
