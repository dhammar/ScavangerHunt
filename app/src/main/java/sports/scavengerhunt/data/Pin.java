package sports.scavengerhunt.data;

/**
 * Created by dave on 7/16/15.
 */
public class Pin {

    private final String LAT, LONG, DESCRIPTION;
    private int id;
    public Pin(String latCoord, String longCoord, String description, int id){
        LAT = latCoord;
        LONG = longCoord;
        DESCRIPTION = description;
    }

    public String getLat(){
        return LAT;
    }

    public String getLong(){
        return LONG;
    }

    public String getDescription(){
        return DESCRIPTION;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
