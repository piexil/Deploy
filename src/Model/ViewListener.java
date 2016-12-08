package Model;

import java.io.IOException;

/**
 * Created by fragg on 12/8/2016.
 */
public interface ViewListener {
    public void keepAlive(boolean isTurn, boolean turnComplete, long timeStamp, Turn turn, String id) throws IOException;
}
