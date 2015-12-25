import java.util.Scanner;

public class Bt21 {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.println("Hay nhap so nguyen N :");
		int n = sNhap.nextInt();
		System.out.println("Tong cac chu so cua " + n + " la : " + TinhTong(n));
		System.out.print("so " + n + " = ");
		for (int i = 2; n > 1;) {
			if(n==i){// neu n la so nguyen to
				System.out.println(i);
				break;
			}
			if (n % i == 0) {
				System.out.print(i + " x " );
				n = n / i;
			} else {
				i++;
			}
		}
	}
	public static int TinhTong(int n) {
		int s = 0;
		while (n > 0) {
			s += n % 10;
			n = n / 10;
		}
		return s;
	}
	

}
