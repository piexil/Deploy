package Model;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by fragg on 12/8/2016.
 */
public class DDmodel implements ViewListener{
    private HashMap<String, Player> players = new HashMap<>(); //colelction of all players
    private Player player; //current player
    private ModelListener modelListener;
    public DDmodel(ModelListener modelListener){
        this.modelListener = modelListener;
    }
    public void executeTurn(Player player, Turn turn){


    }
    @Override
    public void keepAlive(boolean isTurn, boolean turnExecuted, long timeStamp, Turn turn, String id) throws IOException{
        for(Player p: players.values()){
            if(p.getId().equals(id)){
                if(player.equals(p)){
                    if(isTurn){
                        if(turnExecuted){
                            executeTurn(player,turn);
                        }else{
                            modelListener.keepAlive(true);
                        }
                    }

                }else{
                    modelListener.keepAlive(false);
                }
            }
        }
    }
    public Player getPlayer(){
        return player;
    }

}
