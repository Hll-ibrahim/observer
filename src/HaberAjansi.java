import java.util.*;
public class HaberAjansi implements Subject {
    private int sale;
    private List<Observer> customers;
    public HaberAjansi(){
        customers = new ArrayList<>();
    }

    public void setSale(int sale) {
        this.sale = sale;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : customers){
            observer.update(sale);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        this.customers.remove(observer);
    }

}
