package YouTube;

public interface Subject {
    void registerSubscribe(Observer observer);
    void removeSubscribe(Observer observer);
    void notifyNewVideo();
}
