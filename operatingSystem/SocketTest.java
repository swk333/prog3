import java.net.*;
import java.io.*;
public class SocketTest {
   private final int port = 80; //httpのデフォルトのポート番号
   public void getHtmlFile(String hostAddress, String filePath) {
       Socket socket;           //java.net.Socket
       BufferedReader reader;   //socketからデータを読み込むためのreader
       BufferedWriter writer;   //socketにデータを書き込むためのwriter
       try {
           socket = new Socket( hostAddress, port );
           reader = new BufferedReader( new InputStreamReader(socket.getInputStream()) );
           writer = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream()) );
           writer.write("GET " + filePath + " HTTP/1.0\r\n");
           writer.write("Host: " + hostAddress + ":" + port + "\r\n");
           writer.write("\r\n");
           writer.flush();
           while( true ) {
               String line = reader.readLine();
               if ( line == null ) break;
               System.out.println( line );
               System.out.println("test!");
           }
           reader.close();
           writer.close();
           socket.close();
       } catch (UnknownHostException e){
           e.printStackTrace();
       } catch (IOException e){
           e.printStackTrace();
       }
   }
   public static void main(String[] args){
      SocketTest s = new SocketTest();
      s.getHtmlFile("httpbin.org", "http://httpbin.org/");
   }
}