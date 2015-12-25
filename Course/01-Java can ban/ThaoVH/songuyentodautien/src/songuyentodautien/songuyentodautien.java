package songuyentodautien;

import java.awt.Label;
import java.util.Scanner;

public class songuyentodautien {
	private static int Nhap(){
	Scanner input = new Scanner(System.in);
	int n=0;
	boolean check= false;
	while(!check){
		System.out.println("");
		try{
			n = input.nextInt();
			check=true;
		}
		catch(Exception e){
			System.out.println("Nhập số nguyên:");
			input.nextLine();
		}
	}
	return n;
}
	private static int ktsonguyento(int n){
		for(int i=2;n>1;i++){
			if(n%i==0){
				n/=i;
				i=1;	
			}
		}
		return n;
	}
	private static int songuyentodau(int n){
		Label:
		for(int i=2;n>1;i++){
			if(n%i==0){
				System.out.println(i+"");
				n/=i;
				i=1;
					break Label;
			}
				else{
					continue Label;
				}
					
			}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số nguyên tố:");
		int n=Nhap();
		if(n>0)
		{
		if(ktsonguyento(n)==1)
		System.out.println("Là số nguyên tố");
		else
			System.out.println("Không phải là số nguyên tố");
		}
		System.out.println("Số nguyên tố đầu tiên");
		songuyentodau(n);
	}

}
