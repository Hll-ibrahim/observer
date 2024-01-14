public class HavaDurumuEkran implements Observer{
    private int sicaklik;
    @Override
    public void update(int sicaklik) {
        this.sicaklik = sicaklik;
        display();
    }
    public void display(){
        System.out.println("Hava sıcaklığı : "+sicaklik);
    }
}
