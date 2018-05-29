package Chap02_OOP;

import java.lang.reflect.Method;
import java.util.Scanner;

public class BaiTap2_Quarter extends BaiTap2_people {// mac cho de bai quan ly khu pho nay chi co 2 thuoc tinh nhung do mang tinh ke thua nen bac buoc contractor phai khai bao hoten, ngay sinh, nghe ngiep
public String soNha;
public int soThanhVien;

public BaiTap2_Quarter() {
	
}

public BaiTap2_Quarter (String hoTen, String ngheNgiep, String ngaySinh, int soThanhVien, String soNha) {
	super(hoTen, ngheNgiep, ngaySinh);// ke thua cua class people
	this.soThanhVien=soThanhVien;
	this.soNha=soNha;
}


BaiTap2_people[] danhsach1 = null;
@Override// bat buoc phai co vi chong phuong thuc      
public void NhapTT() {
	// int sohothu =1;
	Scanner sc1 = new Scanner(System.in);
	System.out.println(" Nhap so thanh vien trong nha : ");
	soThanhVien = Integer.parseInt(sc1.nextLine());// ddeer khong troi lenh  neu dung nextint la troi lenh ngay.
	System.out.println(" Nhap so dia chi nha cua ho dan : ");
	soNha = sc1.nextLine();// 
	danhsach1 = new BaiTap2_people[soThanhVien];
	for (int i=0; i< danhsach1.length; i++) {
		danhsach1[i] = new BaiTap2_people();// 
		danhsach1[i].NhapTT();// danhsach[i].NhapTT()  ko dung lenh nay nhe vitrong hap nhap co ham nhap con khong duoc luu o nho so bi de khi main thuc thi danhsach1.hoTen se ko ra vi 
		//System.out.println(danhsach11[i].hoTen); 
	}}
@Override// bat buoc phai co vi chong phuong thuc 
public void XuatTT() {
	//System.out.println(" So thanh vien trong khu pho nay la : "+ soThanhVien);	
	//System.out.println("----------------------Thong tin ca nhan trong Khu Pho-------------------");	
	for (int i=0; i< danhsach1.length; i++)
	{ danhsach1[i].XuatTT();
	System.out.printf("%-20s%-15s%-20s%-30s", danhsach1[i].hoTen, danhsach1[i].ngaySinh, danhsach1[i].ngheNgiep,soNha);//so nha nam trong class nay nen khong cn t
	System.out.println("");
	}
}
}
