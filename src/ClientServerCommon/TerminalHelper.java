package ClientServerCommon;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

/**
 * Created by fragg on 12/5/2016.
 */
public class TerminalHelper {
    private Terminal term;
    public TerminalHelper(Terminal term){
        this.term = term;
    }
    public void printString(String string){
        for(int i = 0; i<string.length();i++){
            try {
                term.putCharacter(string.charAt(i));
                term.flush();
            }catch (IOException ioe){

            }
        }

    }
}
