import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int port=6066;
		
		String serverName="localhost";
		try
		{
		Socket client=new Socket(serverName, port);
		DataOutputStream out=new DataOutputStream(client.getOutputStream());
		while(true)
		{
		out.writeUTF("Heyy");
		}
		}
		catch(Exception e)
		{
			System.out.print(e.toString());
		}
	}

}
