import java.util.Scanner;

public class Arraystring19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of elements:");
		int a=s.nextInt();
		System.out.println("Enter your elements:");
		String arr[]=new String[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=s.next();
		}
		for(String i:arr)
		//for(int i=0;i<a;i++)
		{
			System.out.println(i);
			}
		}

	}
