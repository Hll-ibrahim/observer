
public class Main {
    public static void main(String[] args) {
        HavaDurumuServisi havaDurumuServisi = new HavaDurumuServisi();
        HavaDurumuEkran havaDurumuEkran1 = new HavaDurumuEkran();
        HavaDurumuEkran havaDurumuEkran2 = new HavaDurumuEkran();

        havaDurumuServisi.registerObserver(havaDurumuEkran1);
        havaDurumuServisi.registerObserver(havaDurumuEkran2);

        havaDurumuServisi.setSicaklik(23);
    }
}