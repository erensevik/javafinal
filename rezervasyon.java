public class Rezervasyon {
    private String yolcuAdi;
    private Ucak ucak;
    private Lokasyon kalkisYeri;
    private Lokasyon varisYeri;
    private String kalkisTarihi;
    private String varisTarihi;

    public Rezervasyon(String yolcuAdi, Ucak ucak, Lokasyon kalkisYeri, Lokasyon varisYeri, String kalkisTarihi, String varisTarihi) {
        this.yolcuAdi = yolcuAdi;
        this.ucak = ucak;
        this.kalkisYeri = kalkisYeri;
        this.varisYeri = varisYeri;
        this.kalkisTarihi = kalkisTarihi;
        this.varisTarihi = varisTarihi;
    }

    public void bilgileriGoster() {
        System.out.println("Yolcu Adı: " + yolcuAdi);
        System.out.println("Uçak Bilgileri:");
        ucak.bilgileriGoster();
        System.out.println("Kalkış Yeri:");
        kalkisYeri.bilgileriGoster();
        System.out.println("Varış Yeri:");
        varisYeri.bilgileriGoster();
        System.out.println("Kalkış Tarihi: " + kalkisTarihi);
        System.out.println("Varış Tarihi: " + varisTarihi);
    }
}