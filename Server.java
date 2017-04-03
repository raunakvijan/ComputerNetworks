import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	/**
	 * @param args
	 */
	static Socket socket;
	static DataInputStream in;
	static DataOutputStream out;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		ServerSocket server=new ServerSocket(6066);
		server.setSoTimeout(100000);
		socket=server.accept();
		 in=new DataInputStream(socket.getInputStream());
		 out=new DataOutputStream(socket.getOutputStream());

		}
		catch(Exception e)
		{
					System.out.print("1 "+e.toString());
		}
		while(true)
		{
		try
		{
		System.out.print(in.readUTF());
		out.writeInt(2);
		
		
		}
		catch(Exception e)
		{
							System.out.print("2"+e.toString());
		break;
		}
		}
	}

}