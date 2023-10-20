package abstraktmodell;
import enums.LastKaj;


public abstract class Lastbil {
    private String kaj;
    private static int vikt;
    private String name;
    public Lastbil(String name,String kaj, int vikt) {
        this.name = name;
        this.kaj = kaj;
        this.vikt = vikt;
    }

    public String getName(){
        return name;
    }


    public String getKaj() {
        return kaj;
    }

}
