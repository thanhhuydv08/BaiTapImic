package Chap02_OOP;

import java.util.Scanner;

public class BaiTap1_sinhVien {
	public String Bt1Name;
	public double Bt1DTB1;
	public double Bt1DTB2;
	public String Bt1Code;
	public String getBt1Name() {
		return Bt1Name;
	}
	public void setBt1Name(String bt1Name) {
		Bt1Name = bt1Name;
	}
	public double getBt1DTB1() {
		return Bt1DTB1;
	}
	public void setBt1DTB1(double bt1dtb1) {
		Bt1DTB1 = bt1dtb1;
	}
	public double getBt1DTB2() {
		return Bt1DTB2;
	}
	public void setBt1DTB2(double bt1dtb2) {
		Bt1DTB2 = bt1dtb2;
	}
	public String getBt1Code() {
		return Bt1Code;
	}
	public void setBt1Code(String bt1Code) {
		Bt1Code = bt1Code;
	}
	
public void Bt1NhapTT() {
	Scanner sc3 = new Scanner(System.in);	
	System.out.print(" Nhập tên sinh viên : ");
	Bt1Name= sc3.nextLine();
	System.out.print(" Nhập Mã sinh viên : ");
	Bt1Code= sc3.nextLine();
	System.out.print(" Nhập điểm trung bình : ");
	Bt1DTB1 = Double.parseDouble(sc3.nextLine());
	}	
public void Bt1HienThi() {
	System.out.printf("%-20s%-15s%-10s",Bt1Name,Bt1Code,Bt1DTB1 );
	System.out.println("");
}
public void Bt1Sort() {
	
}


}
