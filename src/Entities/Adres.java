package Entities;

public class Adres {
    public Adres() {
    }

    public Adres(int id, Musteri musteri, int musteriId, String adres) {
        this.id = id;
        this.musteri = musteri;
        this.musteriId = musteriId;
        this.adres = adres;
    }

    private int id;
    private Musteri musteri;
    private int musteriId=musteri.getId();
    private String adres;

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
