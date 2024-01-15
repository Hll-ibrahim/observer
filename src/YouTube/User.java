package YouTube;

import java.util.List;

public class User implements Observer{
    private String notificationTitle;
    private String name;
    private List<Subject> channels;
    public User(String username){
        this.name = username;
    }
    @Override
    public void update(String title) {
       System.out.println(name+" notified: "+title);
    }

}
