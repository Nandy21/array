import java.util.Arrays;
import java.util.Scanner;


public class firstrep {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<9;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println(a[i]);
				break;
			}
		}

	}

}
