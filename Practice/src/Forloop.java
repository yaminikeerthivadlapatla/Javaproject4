import java.util.*;
public class Forloop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		/*for(int i=1; i<=n; i++)   
		{ 
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				}   
			System.out.println();
			}*/
		/*int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		/*int i=0,j=0;
		for(i=1;i<10;i++)
		{
			for(j=1;j<10;j++)
			{
				System.out.println(j);
			}
			System.out.println(i);
		}*/
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