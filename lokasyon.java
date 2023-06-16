public class Lokasyon {
    private String ulke;
    private String sehir;
    private String havaalani;
    private boolean aktif;

    public Lokasyon(String ulke, String sehir, String havaalani, boolean aktif) {
        this.ulke = ulke;
        this.sehir = sehir;
        this.havaalani = havaalani;
        this.aktif = aktif;
    }

    public void bilgileriGoster() {
        System.out.println("Ülke: " + ulke);
        System.out.println("Şehir: " + sehir);
        System.out.println("Havaalanı: " + havaalani);
        System.out.println("Aktif: " + aktif);
    }
}