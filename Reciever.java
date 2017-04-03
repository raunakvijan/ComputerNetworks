import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Reciever {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Socket rec;
		try
		{
		ServerSocket server=new ServerSocket(9000);
		rec=server.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(rec.getInputStream()));
		System.out.print(br.readLine());
		}
		catch(Exception e)
		{
			
		}
	}

}
