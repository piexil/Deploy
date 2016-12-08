package Server;

import Model.DDmodel;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import ClientServerCommon.TerminalHelper;
/**
 * Created by fragg on 12/4/2016.
 */
public class DDServer {
    public static void main(String args[]){
        if(args.length != 2) usage();

        try{
            Terminal term = new DefaultTerminalFactory().createTerminal();
            term.enterPrivateMode();
            TerminalHelper terminalHelper = new TerminalHelper(term);
            terminalHelper.printString("Starting Server");
            String serverHost = args[0];
            int serverPort = Integer.parseInt(args[1]);
            DatagramSocket mailbox = new DatagramSocket(new InetSocketAddress(serverHost, serverPort));
            DDmodel model = new DDmodel();
            ServerReaderThread readerThread = new ServerReaderThread(mailbox, model);
            readerThread.start();



        }catch (IOException ioe){
            System.out.println("Error: Could not lock terminal.");
            System.exit(1);

        }



    }
    public static void usage(){
        System.out.println("Usage: DDServer <hostname> <port>");
        System.exit(1);
    }
}
