import java.util.Scanner;
import java.util.function.BinaryOperator;


public class Crc {

	/**
	 * @param args
	 */
	static int [] message;
	static int [] generator;
	static int [] result;
	static int [] rem;
	static String in;

	static int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message");

		 in=sc.next();
		 len=in.length();
		 message=toArray(in);
		System.out.println("Enter CRC generator");
		String g=sc.next();
		generator=toArray(g);
		System.out.println("Enter your choice 1. send 2.recieve");
		int choice=sc.nextInt();
		if(choice==1)
			send();
	/*	else
			recieve();*/
	}
	
	public static void send() {
		int n=message.length+generator.length-1;
		int [] mess=new int [n];
		int result[]=new int[n];

		for (int i = 0; i < message.length ; i++) {
			mess[i]=message[i];
			result[i]=message[i];
			
		}
		
		boolean res=true;
		while(res)
		{
		res=divide(mess,generator,n);
		}
	
		remainder(mess);
		System.out.println("Message send is");
		System.out.print(in);
		for (int i = 0; i < rem.length; i++) {
			System.out.print(rem[i]);
		}

		
	}
	public static boolean divide(int [] mess,int [] gen,int n) {
		int i;
		for ( i = 0; i <n ; i++) {
			if(mess[i]==1)
				break;
		}
		int first=i;
		if(first+gen.length<=mess.length)
		{
			for (int j = 0; j < gen.length; j++) {
				
			
			mess[first]=ex(mess[first],gen[j]);
			first++;
			}
/*//			for (int j = 0; j < mess.length; j++) {
//				
//			
//			System.out.print(mess[j]);
//			}
*/			
			
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	public static int ex(int a ,int b) {
		if(a==b)
			return 0;
		else
			return 1;
		
	}
	
	private static void remainder(int [] mess) {
		int len=mess.length;
		int index=len-generator.length+1;
		rem=new int[generator.length-1];
		for(int i=0;i<generator.length-1;i++)
		{
			rem[i]=mess[index];
			index++;
		}
	}
	
	public static int [] toArray(String in) {
		int n=in.length();
		int [] res=new int[n];
		for (int i = 0; i <n ; i++) {
			res[i]=(in.charAt(i)-48);
		}
		return res;
	}

}
