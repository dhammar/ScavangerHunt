package sports.scavengerhunt.data;

/**
 * Created by dave on 7/16/15.
 */
public class Pin {

    private final String LAT, LONG, DESCRIPTION;
    public Pin(String latCoord, String longCoord, String description){
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
}
