package Model;

/**
 * Created by fragg on 12/8/2016.
 */
public class Deployment {
    private int soliderCount;
    private int x,y;
    private char name;
    private Deployment(int soliderCount, int x, int y, char name){
        this.soliderCount = soliderCount;
        this.x = x;
        this.y = y;
        this.name = name;
    }
}
