package Entities;

public class TicariFaaliyetler {
    public TicariFaaliyetler() {
    }

    public TicariFaaliyetler(int id, GercekMusteri gercekMusteri, int gercekMusteriId, String balsangicTarihi) {
        this.id = id;
        this.gercekMusteri = gercekMusteri;
        this.gercekMusteriId = gercekMusteriId;
        this.balsangicTarihi = balsangicTarihi;
    }

    private int id;
    private GercekMusteri gercekMusteri;

    public GercekMusteri getGercekMusteri() {
        return gercekMusteri;
    }

    public void setGercekMusteri(GercekMusteri gercekMusteri) {
        this.gercekMusteri = gercekMusteri;
    }

    private int gercekMusteriId=this.gercekMusteri.getId();
    private String balsangicTarihi;






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGercekMusteriId() {
        return gercekMusteriId;
    }

    public void setGercekMusteriId(int gercekMusteriId) {
        this.gercekMusteriId = gercekMusteriId;
    }

    public String getBalsangicTarihi() {
        return balsangicTarihi;
    }

    public void setBalsangicTarihi(String balsangicTarihi) {
        this.balsangicTarihi = balsangicTarihi;
    }
}
