import java.util.*;
public class skip
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("M=");
		int m=obj.nextInt();
		System.out.println("N=");
		int n=obj.nextInt();
		System.out.println("K=");
		int k=obj.nextInt();
		while(m<=n)
		{
		    System.out.println(m);
		    m=m+k+1;
		}
	}
}