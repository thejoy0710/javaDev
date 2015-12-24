package tongdaysonguyen;

import java.util.Scanner;

public class tongdaysonguyen {
	private static int Nhap(){
		Scanner input =new Scanner(System.in);
		int n=0;
		boolean check=false;
		while(!check){
			System.out.println("");
			try{
				check=true;
				n=input.nextInt();
			}
			catch(Exception e){
				System.out.println("Nhập số nguyên:");
				input.nextLine();
			}
		}
		return (n);
	}
	private static int tong(long a){
		int tong=0;
		long n;
		while(a!=0){
			n=a%10;
			tong+=a%10;
			a/=10;
		}
		return (tong);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số nguyên n:");
		int n=Nhap();
		System.out.println("Tổng dãy số nguyên:"+tong(n));
	}

}
