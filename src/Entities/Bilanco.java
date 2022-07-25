package Entities;

public class Bilanco {
    public Bilanco() {
    }

    public Bilanco(int id, Musteri musteri, int musteriId, String tarih, double tutar) {
        this.id = id;
        this.musteri = musteri;
        this.musteriId = musteriId;
        this.tarih = tarih;
        this.tutar = tutar;
    }
    private int id;

    private Musteri musteri;

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    private int musteriId=this.musteri.getId();
    private String tarih;
    private double tutar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }
}
