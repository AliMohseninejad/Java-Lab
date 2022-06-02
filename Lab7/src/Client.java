import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    final static int serverPort = 1234;

    public static void main(String[] args) throws UnknownHostException, IOException {

        Scanner scn = new Scanner(System.in);

        InetAddress ip = InetAddress.getByName("localhost");

        Socket s = new Socket(ip, serverPort);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        SendMessage sm = new SendMessage(scn, dos);
        Thread sendMessage = new Thread(sm);

        ReadMessage rm = new ReadMessage(dis);
        Thread readMessage = new Thread(rm);

        sendMessage.start();
        readMessage.start();



    }
}

class SendMessage implements Runnable{

    final Scanner scn;
    final DataOutputStream dos;

    SendMessage(Scanner scn, DataOutputStream dos) {
        this.scn = scn;
        this.dos = dos;
    }

    @Override
    public void run() {

        while (true) {

            String message = scn.nextLine();

            try {
                dos.writeUTF(message);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReadMessage implements Runnable{

    final DataInputStream dis;

    ReadMessage(DataInputStream dis) {
        this.dis = dis;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String message = dis.readUTF();
                System.out.println(message);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
