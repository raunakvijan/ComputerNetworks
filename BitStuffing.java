import java.util.Scanner;


public class BitStuffing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter frame");
		String frame=sc.next();
		
		System.out.println("Enter choice 1. send 2 . recieve");
		int choice=sc.nextInt();
		if(choice==1)
		{
			//my#na#eidi#am#
			//my@#na@#eidi@#am@#
			String res=frame;
			 res=res.replace("011111","0111110");

			System.out.print(res);
		}
		else {
			String res=frame;
			 res=res.replace("0111110","011111");

			System.out.print(res);
		}
		//011111101010011011111110
		//01111101010100110111110110
	}

}
