import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class SAWReciever {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] order=new int[]{1,2,4,5,6};
		int index=-1;
		try
		{
		ServerSocket server=new ServerSocket(6066);
		Socket reciever=server.accept();
		DataOutputStream out=new DataOutputStream(reciever.getOutputStream());
		DataInputStream in=new DataInputStream(reciever.getInputStream());
		while(true)
		{
			if(!(in.readInt()+"").isEmpty())
			{

				if(in.readInt()==order[index+1])
				{
					index++;
					System.out.println("Frame no "+in.readInt()+" recieved");
					out.writeInt(2);
				}
				else
				{
					System.out.println("Frame not in order");

				}
			}
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}
	}

}
