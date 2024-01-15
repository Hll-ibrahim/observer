package YouTube;
import java.util.*;

public class Channel implements Subject{
    private String channelName;
    private List<Observer> subscribers;
    public Channel(){
        this.subscribers = new ArrayList<>();
    }
    public Channel(String name){
        this.channelName = name;
        this.subscribers = new ArrayList<>();
    }
    @Override
    public void registerSubscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeSubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyNewVideo() {
        for(Observer observer : this.subscribers){
            observer.update("Java in 1 hour!");
        }
    }
}
