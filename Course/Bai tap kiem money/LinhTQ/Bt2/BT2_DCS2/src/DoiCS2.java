import java.util.ArrayList;
import java.util.Scanner;

public class DoiCS2 {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.println("Xin moi nhap so n :");
		int n = sNhap.nextInt();
		System.out.print("so " + n +" he so 10 chuyen qua he so nhi phan la: ");
		NhiPhan(n);
	}

	public static void NhiPhan(int n) {
		if (n <= 0)
			return ;
		else {
			NhiPhan(n/2);
			System.out.print(n%2);
		}
	}

}
