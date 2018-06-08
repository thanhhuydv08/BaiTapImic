package imic.javacore01_programmer;

import java.util.Scanner;

public class ThucHanh02_PrinterTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.printf(" Nhap chieu cao cua tam giac : ");
		int rowHeight = sc.nextInt();
		System.out.println();
		/// tách ra so lẽ in khác số chẵn in khác nhé
	if (rowHeight%2!=0) {
		PrinterOldNumber(rowHeight);
	}else PrinterEvenNumber(rowHeight);
	}
public static void PrinterOldNumber(int h) {
	for (int i=0; i<h; i++) {
		for ( int j=0; j< h+i; j++) {
			if(j>=(h-i-1)&&(i+j)%2==0) {
				System.out.print("*");
			}else System.out.print(" ");
		
		}
		System.out.println();
	}
}
public static void PrinterEvenNumber(int h) {
	for (int i=0; i<h; i++) {
		for ( int j=0; j< h+i; j++) {
			if(j>=(h-i-1)&&(i+j)%2!=0) {
				System.out.print("*");
			}else System.out.print(" ");	
		}
		System.out.println();
	}
}

}

