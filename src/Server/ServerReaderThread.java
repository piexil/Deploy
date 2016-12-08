package Server;

import Model.DDmodel;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by fragg on 12/5/2016.
 */
public class ServerReaderThread extends Thread {
    DatagramSocket mailbox;
    DDmodel model;
    public ServerReaderThread(DatagramSocket mailbox, DDmodel model){
        this.mailbox = mailbox;
        this.model = model;
    }
    @Override
    public void run() {
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        ByteArrayInputStream bais;
        DataInputStream in;
        byte b;
        String arg;
        try{
            while (true){
                mailbox.receive(packet);
                bais = new ByteArrayInputStream(buf, 0, packet.getLength());
                in = new DataInputStream(bais);
                b = in.readByte();
                switch (b){

                }
            }
        }catch (IOException e){

        }
        }
    }