package Chap02_OOP;

import java.util.Scanner;

public class BaiTap2_people {
 public String hoTen, ngheNgiep, ngaySinh;
 public BaiTap2_people() {
	 
 }
 public BaiTap2_people(String hoTen, String ngheNgiep, String ngaySinh) {// day la contractor don gian
	 // hoac chung ta co the dung get hay setter co san torng eclip alt+shift+s+r
	// TODO Auto-generated constructor stub
	 this.hoTen=hoTen;
	 this.ngheNgiep=ngheNgiep;
	 this.ngaySinh=ngaySinh;
}

 public void NhapTT() {
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println(" Nhap ho ten : ");
	 hoTen= sc1.nextLine();
	 System.out.println(" Nhap Ngay sinh : ");
	 ngaySinh= sc1.nextLine();
	 System.out.println(" Nhap Nghe ngiep : ");
	 ngheNgiep= sc1.nextLine();
 }
public void XuatTT() {
//System.out.printf("%-20s%-15s%-20s", hoTen, ngaySinh, ngheNgiep);
}

}