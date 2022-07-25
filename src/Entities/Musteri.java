package Entities;

public class Musteri {
    public Musteri() {
    }

    public Musteri(int id, int musteriNo, Kanal kanal) {
        this.id = id;
        this.musteriNo = musteriNo;
        this.kanal = kanal;
    }

    private int id;
    private int musteriNo;
    private Kanal kanal;

    public Kanal getKanal() {
        return kanal;
    }

    public void setKanal(Kanal kanal) {
        this.kanal = kanal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }
}
