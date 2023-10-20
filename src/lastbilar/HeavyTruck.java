package lastbilar;

public class HeavyTruck extends abstraktmodell.Lastbil {
    private String regNr;
    private int vikt;
    private String name;
    public HeavyTruck(String name, String regNr, int vikt) {
        super(name, regNr, vikt);
        this.name=name;
        this.regNr=regNr;
        this.vikt=vikt;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
    @Override
    public String toString() {
        return "Van{" +
                "regNr='" + regNr + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
