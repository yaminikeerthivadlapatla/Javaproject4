import java.util.Scanner;
public class Left_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0; i<n; i++)   
		{ 
			for(int j=2*(n-i);j>0; j--)
			{
				System.out.print(" ");
			}  
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");		
		}
		System.out.println(" ");
		}
	}
}