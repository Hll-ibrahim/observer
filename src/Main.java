
public class Main {
    public static void main(String[] args) {
        HavaDurumuServisi havaDurumuServisi = new HavaDurumuServisi();
        HavaDurumuEkran havaDurumuEkran1 = new HavaDurumuEkran();
        HavaDurumuEkran havaDurumuEkran2 = new HavaDurumuEkran();

        havaDurumuServisi.registerObserver(havaDurumuEkran1);
        havaDurumuServisi.registerObserver(havaDurumuEkran2);

        havaDurumuServisi.setSicaklik(23);

        System.out.println("---------------");

        HaberAjansi haberAjansi = new HaberAjansi();
        HaberEkrani haberEkrani1 = new HaberEkrani("A Spor");
        HaberEkrani haberEkrani2 = new HaberEkrani("Haber Türk");

        haberAjansi.registerObserver(haberEkrani1);
        haberAjansi.registerObserver(haberEkrani2);

        haberAjansi.setSale(29);
    }
}