public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private String girisyili;
    private long ogrNo;
    private int bolumKodu;
    private String girisSirasi;


    public Ogrenci(String ad, String bolum, double gano, String girisyili, int bolumKodu, String girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisyili = girisyili;
        this.bolumKodu = bolumKodu;
        this.girisSirasi = girisSirasi;
    }

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }


    public Ogrenci() {
    }

    public String ogrenciNoOlusturma(String Girisyili, int BolumKodu, String GirisSirasi) {
        String No = String.valueOf(getGirisyili() + getBolumKodu() + getGirisSirasi());
        return No;
    }



    //GETTER'LER
    public String getAd() {
        return ad;
    }

    public double getGano() {
        return gano;
    }

    public String getBolum() {
        return bolum;
    }

    public String getGirisyili() {
        return girisyili;
    }

    public long getOgrNo() {
        return ogrNo;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public String getGirisSirasi() {
        return girisSirasi;
    }



    //SETTER'LER
    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4)
            throw new IllegalArgumentException("Böyle bir değer geçersizdir.");

        this.gano = gano;
    }

    public void setGirisyili(String girisyili) {
        this.girisyili = girisyili;
    }

    public void setOgrNo(long ogrNo) {
        this.ogrNo = ogrNo;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public void setGirisSirasi(String girisSirasi) {
        this.girisSirasi = girisSirasi;
    }


}
