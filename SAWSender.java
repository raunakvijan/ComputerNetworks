import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class SAWSender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter no of frames to send");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int [] frames=new int[no];
		try
		{
		Socket sender=new Socket("localhost",6066);
		
		DataOutputStream out=new DataOutputStream(sender.getOutputStream());
		DataInputStream in=new DataInputStream(sender.getInputStream());
		for (int i = 0; i <no; i++) {
			System.out.println("Enter frame no");
			frames[i]=sc.nextInt();
		}

		for (int i = 0; i < no; i++) {
			out.writeInt(frames[i]);
		}
			System.out.print("Hello");
			while((in.readInt()+"")!="")
			
				{
				if(in.readInt()==2)
				
			{
				System.out.println("Frame no sent");


			}
			else 
			{
				System.out.println("Frame not send . Retransmitting");
				
			}
				}
		
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

}
