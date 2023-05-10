package S3_02_N1;

public class Main {

    /*
    Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers)
    canvis quan la Borsa puja o baixa.

    És necessari que l'objecte Observable mantingui referències als Observers.
     */
    public static void main(String[] args) {

        Observable_BankAgent bankAgent = new Observable_BankAgent();

        new Observer1(bankAgent);
        new Observer2(bankAgent);

        System.out.println("State has changed");
        bankAgent.setState(15);

        System.out.println("State has changed");
        bankAgent.setState(10);

    }
}
