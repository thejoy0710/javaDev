import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.println("Hay nhap so n :");
		int n = sNhap.nextInt();
		System.out.println("so Fibonaci thu n = " + n + " la : " + Fibo(n));
	}

	public static long Fibo(int n) {
		if (n == 0 || n == 1)
			return 1;
		return Fibo(n - 1) + Fibo(n - 2);
	}
}
