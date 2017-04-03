import java.io.BufferedWriter;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Sender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter no to send");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		PrintStream ps = null;
		try
		{
		Socket sender=new Socket("localhost",9000);
		ps=new PrintStream(sender.getOutputStream());
		}
		catch(Exception e)
		{
			System.out.print(e.toString());
		
	}
		ps.println(s);
		

	}
	}
