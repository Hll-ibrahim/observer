public class HaberEkrani implements Observer{
    private int sale;
    private String name ;
    public HaberEkrani(String name){
        this.name = name;
    }
    @Override
    public void update(int sale) {
        this.sale = sale;
        display();
    }
    @Override
    public void display(){
        System.out.println("%"+this.sale+" sale!\n--"+name+"--\n");
    }
}
