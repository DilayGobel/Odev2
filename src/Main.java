
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ogrenci[] ogrencis = {
                new Ogrenci("null", "null", 0.0, "1973", 104, "001"),
                new Ogrenci("Gökhan", "Bilgisayar Müh", 0.0, "1985", 104, "001"),
                new Ogrenci("Ayşe", "Makine Müh", 0.0, "1985", 104, "001"),
                new Ogrenci("Elif", "Elektirik-Elektronik Müh", 1.98, "2020", 104, "001")
        };

        System.out.println("\nÖğrenci Bilgileri:");

        String öğrenci0 = "null";
        Ogrenci foundOgrenci0 = null;
        for (Ogrenci n : ogrencis) {
            if (n.getAd().equals(öğrenci0)) {
                foundOgrenci0 = n;
                break;
            }
        }
        if (foundOgrenci0 == null) {
            throw new IllegalArgumentException("Öğrenci bulunamadı.");
        }

        String öğrenci = "Gökhan";
        Ogrenci foundOgrenci = null;
        for (Ogrenci a : ogrencis) {
            if (a.getAd().equals(öğrenci)) {
                foundOgrenci = a;
                break;
            }
        }
        if (foundOgrenci == null) {

            throw new IllegalArgumentException("Öyle bir öğrenci yoktur.");
        }


        String öğrenci2 = "Ayşe";
        Ogrenci foundOgrenci2 = null;
        for (Ogrenci b : ogrencis) {
            if (b.getAd().equals(öğrenci2)) {
                foundOgrenci2 = b;
                break;
            }
        }
        if (foundOgrenci2 == null) {

            throw new IllegalArgumentException("Öyle bir öğrenci yoktur.");
        }


        String öğrenci3 = "Elif";
        Ogrenci foudOgrenci3 = null;
        for (Ogrenci c : ogrencis) {
            if (c.getAd().equals(öğrenci3)) {
                foudOgrenci3 = c;
                break;
            }
        }
        if (foudOgrenci3 == null) {

            throw new IllegalArgumentException("Öyle bir öğrenci yoktur.");
        }


        System.out.println("ORG-1" + " " + ogrencis[0].getAd() + " " + ogrencis[0].getBolum() + " " + foundOgrenci0.ogrenciNoOlusturma(foundOgrenci0.getGirisyili(), foundOgrenci0.getBolumKodu(), foundOgrenci0.getGirisSirasi()) + " " + ogrencis[0].getGano());
        System.out.println("ORG-2" + " " + ogrencis[1].getAd() + " " + ogrencis[1].getBolum() + " " + foundOgrenci.ogrenciNoOlusturma(foundOgrenci.getGirisyili(), foundOgrenci.getBolumKodu(), foundOgrenci.getGirisSirasi()) + " " + ogrencis[1].getGano());
        System.out.println("ORG-3" + " " + ogrencis[2].getAd() + " " + ogrencis[2].getBolum() + " " + foundOgrenci2.ogrenciNoOlusturma(foundOgrenci2.getGirisyili(), foundOgrenci2.getBolumKodu(), foundOgrenci2.getGirisSirasi()) + " " + ogrencis[2].getGano());
        System.out.println("ORG-4" + " " + ogrencis[3].getAd() + " " + ogrencis[3].getBolum() + " " + foudOgrenci3.ogrenciNoOlusturma(foundOgrenci.getGirisyili(), foudOgrenci3.getBolumKodu(), foundOgrenci2.getGirisSirasi()) + " " + ogrencis[3].getGano());


    }
}