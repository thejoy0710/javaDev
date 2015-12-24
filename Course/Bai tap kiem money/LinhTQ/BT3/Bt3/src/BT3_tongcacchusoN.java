import java.util.Scanner;

public class BT3_tongcacchusoN {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.println("Hay nhap so nguyen N :");
		int n = sNhap.nextInt();
		System.out.println("Tong cac chu so cua " + n + " la : " + TinhTong(n));
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
