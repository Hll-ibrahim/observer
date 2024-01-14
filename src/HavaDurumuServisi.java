import java.util.*;
public class HavaDurumuServisi implements Subject {
    private int sicaklik;
    private List<Observer> observers;
    public HavaDurumuServisi(){
        this.observers = new ArrayList<>();
    }
    public void setSicaklik(int sicaklik){
        this.sicaklik = sicaklik;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(sicaklik);
        }
    }
}
