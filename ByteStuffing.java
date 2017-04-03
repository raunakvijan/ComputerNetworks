import java.util.*;


public class ByteStuffing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter frame");
		String frame=sc.next();
		String flag="#";
		String esc="@";
		System.out.println("Enter choice 1. send 2 . recieve");
		int choice=sc.nextInt();
		if(choice==1)
		{
			//my#na#eidi#am#
			//my@#na@#eidi@#am@#
			String res=frame;
			 res=res.replace(esc, esc+esc);

			 res=res.replace(flag,esc+flag);
			System.out.print(res);
		}
		else {
			String res=frame;
			 res=res.replace(esc+esc, esc);

			 res=res.replace(esc+flag,flag);
			System.out.print(res);
		}

	}

}
