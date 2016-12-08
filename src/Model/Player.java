package Model;

/**
 * Created by fragg on 12/8/2016.
 */
public class Player {
    private String name;
    private String id;
    public Player(String name, String id){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
}
