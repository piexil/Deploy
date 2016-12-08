package Model;

import java.io.IOException;

/**
 * Created by fragg on 12/8/2016.
 */
public interface ModelListener {
    void keepAlive(boolean yourTurn) throws IOException;
}
