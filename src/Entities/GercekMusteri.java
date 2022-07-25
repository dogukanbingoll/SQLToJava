package Entities;

public class GercekMusteri extends Musteri{


    public GercekMusteri() {
    }


    public GercekMusteri(int id, int musteriNo, Kanal kanal, String firstName, String lastName, int tcNo) {
        super(id, musteriNo, kanal);
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcNo = tcNo;
    }

    private String firstName;
    private String lastName;
    private int tcNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }
}
