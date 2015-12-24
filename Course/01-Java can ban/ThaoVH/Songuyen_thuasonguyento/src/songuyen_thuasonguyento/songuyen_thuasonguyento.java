package songuyen_thuasonguyento;

import java.util.Scanner;

public class songuyen_thuasonguyento {
	private static int Nhap(){
		Scanner input = new Scanner(System.in);
		boolean check=false;
		int n=0;
		while(!check){
			System.out.println("");
			try{
				n=input.nextInt();
				check=true;
			}
			catch(Exception e){
				System.out.println("Nhập kiểu số nguyên:");
				input.nextLine();
			}
		}
		return (n);
	}
	private static int thuasonguyento(int n){
		for(int i=2;n>1;i++){
			if(n%i==0){
				System.out.println(i+"x");
				n/=i;
				i=1;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số nguyên tố:");
		int n=Nhap();
		System.out.println("Thừa số nguyên tố là:");
		thuasonguyento(n);
	}

}
