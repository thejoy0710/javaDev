import java.util.Scanner;

public class PhanTichSoNguyen {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.println("Xin moi nhap so nguyen N : ");
		int n = sNhap.nextInt();
		System.out.print("so " + n + " = ");
		for (int i = 2; n > 1;) {
			if(n==i){
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
}
