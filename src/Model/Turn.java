package Model;
import Model.Buildings.Building;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fragg on 12/8/2016.
 */
public class Turn {
    private Queue<DDAction> actionQueue = new LinkedList<>();


    private class DDAction{
        String type;
        Deployment deployment;
        Building building;
        int x,y;
        public DDAction(String type, Deployment deployment, int x, int y){

        }


    }
}
