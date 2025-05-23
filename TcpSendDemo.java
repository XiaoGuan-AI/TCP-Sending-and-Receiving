import java.io.OutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TcpSendDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("服务器主机名或IP"), 10086);
        OutputStream os = s.getOutputStream();
        String str = "Hello TCP! Please receive the first message:计算机网络课程设计";
        os.write(str.getBytes());
        System.out.println("发送端已成功发送TCP数据段！请注意在接收端查看！");
        s.close();
    }
}