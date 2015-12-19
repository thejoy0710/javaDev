import java.util.Scanner;

public class TimUSCLN_BSCNN {

	public static void main(String[] args) {
	
	Scanner sNhap = new Scanner(System.in);
	System.out.println("Hay nhap so a :");
	int soa = sNhap.nextInt();
	System.out.println("Hay nhap so b:");
	int sob = sNhap.nextInt();
	
	System.out.println("USCLN cua a va b la :" + USCLN(soa,sob));
	System.out.println("BSCNN cua a va b la :" + (soa*sob)/USCLN(soa,sob));
	}

	public static int USCLN(int a,int b)
	{
		while(a!=b)
		{
			if(a>b) 
				a -=b;
			else
				b-=a;
		}
		return a;
	}
}
