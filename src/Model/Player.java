package Model;

import java.util.HashMap;

/**
 * Created by fragg on 12/8/2016.
 */
public class Player {
    private HashMap<Character, Deployment> deploment = new HashMap<Character, Deployment>();
    private int soliderQueue = 0;
    private String name;
    private String id;
    public Player(String name, String id){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void addSoliders(int x){
        soliderQueue += x;
    }
}
