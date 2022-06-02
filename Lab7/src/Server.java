import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    static ArrayList<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1234);
        Socket s;
        int i = 0;
        while (true) {

            s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            ClientHandler handler = new ClientHandler(s, dis, dos, "client "+i);
            Thread t = new Thread(handler);

            clients.add(handler);
            t.start();
            i++;
        }
    }

}


class ClientHandler implements Runnable {

    private String username = "";
    private String password = "";

    Socket s;
    boolean isLoggedIn;
    final DataInputStream dis;
    final DataOutputStream dos;

    ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos, String username) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
        this.isLoggedIn = true;
        this.username = username;
    }

    @Override
    public void run() {

        String received;
        while (true) {

            try {
                received = dis.readUTF();

                System.out.println(received);

                if (received.equals("logout")) {
                    this.isLoggedIn = false;
                    this.s.close();
                    break;
                }

                String receiver = received.substring(received.indexOf("#")+1);
                String message = received.substring(0, received.indexOf("#"));

                for (ClientHandler h: Server.clients) {
                    if (h.username.equals(receiver) && h.isLoggedIn) {
                        h.dos.writeUTF(this.username + ": " + message);
                        break;
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.dis.close();
            this.dos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}