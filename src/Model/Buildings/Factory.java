package Model.Buildings;

import Model.DDmodel;

/**
 * Created by fragg on 12/8/2016.
 */
public class Factory extends Building{
    int ranks[] = {1,2,3};
    int rank;
    public Factory(int x, int y, DDmodel dDmodel, int rank){
        super(x,y,dDmodel);
        this.rank = rank;
    }
    @Override
    public void executeTurn(){
        if(turnTimer++ > ranks[rank]){
            turnTimer = 0;
            dDmodel.getPlayer().addSoliders(ranks[rank]);
        }
    }
}
