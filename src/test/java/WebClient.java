import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;
import java.net.UnknownHostException;


public class WebClient {

	public static void main(String[] args) {
		Socket sock = null;
		try {
			sock = new Socket("jyjin", 80);
			InputStream in = sock.getInputStream();
			OutputStream out = sock.getOutputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
			
			//RFC 2396 규약
			String id = URLEncoder.encode("1 2 3 4", "utf-8");
			String name = URLEncoder.encode("홍 길 동", "utf-8");
			System.out.println("id = " + id);
			System.out.println("name = " + name);
			
			writer.println("GET /DeployE/login.jsp?id=" +id + "&name=" + name + " HTTP/1.0");
			writer.println(); //
			writer.println();
			writer.flush();
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
