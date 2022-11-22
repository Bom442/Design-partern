package observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    //通知Observers
    public void notifyObservers(){
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()){
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();    //获取数值

    public abstract void excute();      //生成数值
}
