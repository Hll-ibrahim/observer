package YouTube;

public class YouTubeSystem {
    public static void main(String[] args){
        Channel channel = new Channel("Bilim");
        User user1 = new User("halil");
        User user2 = new User("ibrahim");

        channel.registerSubscribe(user1);
        channel.registerSubscribe(user2);

        channel.notifyNewVideo();
    }
}
