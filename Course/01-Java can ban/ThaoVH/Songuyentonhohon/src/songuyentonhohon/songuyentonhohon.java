package songuyentonhohon;

import java.util.Scanner;

public class songuyentonhohon {
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
	private static int songuyentonho(int n){ 
	        int dem = 0; 
	        for (int i = 2; i <= n; i++) { 
	            if (n % i == 0) { 
	                dem += 1; 
	            } 
	        } 
	        if (dem == 1) { 
	            return 1; 
	        } else { 
	            return n; 
	        } 
	    } 
	    public static int lietke(int n){ 
	        int i;  
	        for(i=2;i<n;i++){ 
	            if(songuyentonho (i) ==1){ 
	                System.out.println(i+ " "); 
	             } 
	        } 
	        return n;     
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số nguyên tố:");
		int n=Nhap();
		System.out.println("Liệt kê:");
		lietke(n);
	}
		
}

