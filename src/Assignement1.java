import java.util.Scanner;

public class Assignement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] var=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Values");
		for(int i=0;i<10;i++)
		{
			var[i]=sc.nextInt();
		}
		System.out.println("Reverse of an Array");
		for(int i=9;i>=0;i--)
		{
			System.out.println(var[i]);
		}
	}

}
