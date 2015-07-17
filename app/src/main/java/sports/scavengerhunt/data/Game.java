package sports.scavengerhunt.data;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dave on 7/16/15.
 */
public class Game {

    private Collection<Pin> pins;
    private final String ID;
    public Game(String id){
        this(id, new ArrayList<Pin>());
    }

    public Game(String id, Collection<Pin> pins){
        this.pins = pins;
        ID = id;
    }
    public String getID(){
        return ID;
    }
    public Collection<Pin> getPins(){
        return pins;
    }

    public void addPin(String latCoord, String longCoord){
        addPin(latCoord, longCoord, "");
    }

    public void addPin(String latCoord, String longCoord, String desc){
        if(pins == null){
            pins = new ArrayList<>();
        }
        pins.add(new Pin(latCoord, longCoord, desc, pins.size()));
    }



}
