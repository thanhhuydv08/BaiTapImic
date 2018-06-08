package imic.javacore01_programmer;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Advance_01_Class_Submain_01 {
	int sBirday;
	String sName;
	int sTuoi;	
	public void Advance_01_Class_Submain_01() {
		sBirday= this.sBirday;
		sName= this.sName;
		sTuoi= this.sTuoi;
	}
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ten :");
		sName=sc.nextLine();
		System.out.print("Ngay Sinh :");
		sBirday=sc.nextInt();
		System.out.print("Tuoi:");
		sTuoi=sc.nextInt();			
	}
   public void xuatTT() {
	System.out.println();
	System.out.printf("%-20s%-20s%-10s",sName, sBirday,sTuoi);
	
	}
}
