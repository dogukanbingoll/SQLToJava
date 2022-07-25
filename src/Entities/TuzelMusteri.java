package Entities;

public class TuzelMusteri extends Musteri {
    public TuzelMusteri() {
    }


    public TuzelMusteri(int id, int musteriNo, Kanal kanal, String unvan, int vergiNo) {
        super(id, musteriNo, kanal);
        this.unvan = unvan;
        this.vergiNo = vergiNo;
    }

    public TuzelMusteri(int id, int musteriNo, Kanal kanal) {
        super(id, musteriNo, kanal);
    }

    private String unvan;
    private int vergiNo;

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public int getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(int vergiNo) {
        this.vergiNo = vergiNo;
    }
}
