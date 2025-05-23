import java.io.InputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;

public class TcpReceiveDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        InetAddress address = s.getInetAddress();
        System.out.println("This is client ip---> " + address.getHostAddress());
        System.out.println("发送端你好！我已成功接收到你发的TCP数据段！如下所示：");
        System.out.println(new String(bys, 0, len));
        s.close();
    }
}