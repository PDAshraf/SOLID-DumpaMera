package lastbilar;

public class Van extends abstraktmodell.Lastbil {
    private String regNr;
    private static int vikt;
    private  String name;
    public Van(String name, String regNr, int vikt) {
        super(name,regNr, vikt);
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

    public static int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {

        this.vikt = vikt;
    }

    public  String getName() {
        return this.name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Van{" +
                "regNr='" + regNr + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
