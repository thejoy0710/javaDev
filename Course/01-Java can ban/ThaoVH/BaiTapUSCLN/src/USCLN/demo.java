package USCLN;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = Nhap();
		System.out.println("Nhập b: ");
		int b = Nhap();
		System.out.println("Ước chung lớn nhất của " + a + " và" + b + " là: " + UCLN(a, b));

		System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + ((a * b) / UCLN(a, b)));
	}

	private static int UCLN(int a, int b) {
		// TODO Auto-generated method stub
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	private static int Nhap() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while (!check) {
			System.out.print("");
			try {
				n = input.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Nhập kiểu số: ");
				input.nextLine();
			}

		}
		return (n);
	}

}
