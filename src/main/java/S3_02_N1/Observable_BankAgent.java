package S3_02_N1;

import java.util.ArrayList;
import java.util.List;

public class Observable_BankAgent {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public int getState() {
        return state;
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(Observer::update);
    }
}
