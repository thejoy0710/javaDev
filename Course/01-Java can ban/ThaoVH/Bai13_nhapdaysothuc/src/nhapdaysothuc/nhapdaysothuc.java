package nhapdaysothuc;

import java.util.Arrays;
import java.util.Scanner;
public class nhapdaysothuc {
    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
                    System.out.print(" ");
                    try{
                                n= input.nextInt();
                                check= true;
                    }catch(Exception e){
                                System.out.println("Nhập kiểu số thực");
                                input.nextLine();
                    }
        }
        return (n);
}
public static void nhapmang(int[] a, int begin , int end){
        System.out.println();
        int i;
        for(i=begin ; i<end ; i++){
                    System.out.print(" "+a[i]);
        }
        System.out.println();
}
public static void themphantu(int[] a,int n,int pt){
        a[0]= pt;
        Arrays.sort(a);
}
public static void main(String[] args) {
System.out.println("Nhap n");
        int n= nhap();
        System.out.println("Nhap m");
        int m= nhap();
        int i;
        int[] a= new int[n+m];
        int[] b= new int[m];
        System.out.println("nhap mang A: ");
        for(i=0 ; i<n ; i++){
                    System.out.print("\n Nhap phan tu thu "+i+" = ");
                    a[i]= nhap();
        }
        Arrays.sort(a);
        System.out.println("nhap mang B: ");
        for(i=0 ; i<m ; i++){
                    System.out.print("\n Nhap phan tu thu "+i+" = ");
                    b[i]= nhap();
        }
        Arrays.sort(b);
        for(i=0 ; i<m ; i++){
                    themphantu(a, n+m+1, b[i]);
        }
        nhapmang(a, 0, n+m);

}}