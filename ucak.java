public class Ucak {
    private String model;
    private String marka;
    private String seriNo;
    private int koltukKapasitesi;

    public Ucak(String model, String marka, String seriNo, int koltukKapasitesi) {
        this.model = model;
        this.marka = marka;
        this.seriNo = seriNo;
        this.koltukKapasitesi = koltukKapasitesi;
        }
    }

    public void bilgileriGoster() {
        System.out.println("Uçak Modeli: " + model);
        System.out.println("Marka: " + marka);
        System.out.println("Seri No: " + seriNo);
        System.out.println("Koltuk Kapasitesi: " + koltukKapasitesi);
    }
