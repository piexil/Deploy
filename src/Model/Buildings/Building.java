package Model.Buildings;

import Model.DDmodel;

/**
 * Created by fragg on 12/8/2016.
 */
public abstract class Building {
    private int x, y;
    protected int turnTimer;
    private DDmodel dDmodel;
    public Building(int x, int y, DDmodel dDmodel){
        this.x = x;
        this. y = y;
        this.dDmodel = dDmodel;
    }

    public abstract void executeTurn();
}
