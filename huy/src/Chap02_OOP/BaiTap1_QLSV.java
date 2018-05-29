package Chap02_OOP;

import java.util.Scanner;

public class BaiTap1_QLSV {

public static void main(String[] args) {

	BaiTap1_sinhVien[] danhsach = null; // khoi tao o nho trong cslass BaiTap1_sinhVien[] 
	String [] arr2 = null;
double [] arr3 = null;
	int Bt1Cehck=0;
	System.out.println("--------------------------------------------------------");
	System.out.println("| 1.Nhập danh sách sinh viên.                          |");
	System.out.println("| 2.Hiển thị toàn bộ sinh viên trong danh sách.        |");
	System.out.println("| 3.Tìm sinh viên có điểm trung bình cao nhất.	       |");
	System.out.println("| 4.Sắp xếp sinh viên theo điểm trung bình cao nhất.   |");
	System.out.println("| 5.Thoát chương trình.                                |");
	System.out.println("--------------------------------------------------------");
	System.out.println("-----------------------Nhập lựa chọn -------------------");
	while (Bt1Cehck==0) {//try{
Scanner sc1= new Scanner(System.in);
System.out.print(" Vui lòng nhập lựa chọn cần tìm : ");
int n = sc1.nextInt();
if (1<=n && n<=5) { 
// goi ham thuc hien cac lenh nay
switch (n) {
case 1:{ 
	//BaiTap1_sinhVien sc4 = new BaiTap1_sinhVien();
	System.out.print(" Nhập số sinh viên cần nhập : ");
	int nSinhVien = sc1.nextInt();
	danhsach = new BaiTap1_sinhVien[nSinhVien];//gan o nho danhsach co n sinh vien nhap tu ban phim,
	for (int i=0; i<danhsach.length; i++) {
	  danhsach[i]= new BaiTap1_sinhVien();
		danhsach[i].Bt1NhapTT();
		//System.out.println(danhsach[i].);
	}break;}
	
case 2: {System.out.printf("%-20s%-15s%-10s","Họ Tên","Mã SV","DTB");System.out.println("");
for (int i=0; i<danhsach.length; i++) {
danhsach[i].Bt1HienThi();}break;
}
case 3: double max = danhsach[0].Bt1DTB1;String tenMax ="ko"; for (int i=1; i<danhsach.length; i++) {
	if (max>danhsach[i].Bt1DTB1) {}
	else {max=danhsach[i].Bt1DTB1 ; tenMax = danhsach[i].Bt1Name;}
   } 
System.out.println(" Sinh vien co diem trung binh cao nhat la : "+ tenMax+" va điểm trung bình đó là :"+ max); 
break;
case 4:System.out.println(" Sắp xếp Sinh viên có đểm trung bình tăng dần theo bảng : ");
for (int i=0; i< danhsach.length; i++) {for(int j=i+1; j<danhsach.length;j++)
	{if(danhsach[i].Bt1DTB1>danhsach[j].Bt1DTB1) {
	double temp1=danhsach[i].Bt1DTB1; danhsach[i].Bt1DTB1=danhsach[j].Bt1DTB1;danhsach[j].Bt1DTB1=temp1;	
	String temp2=danhsach[i].Bt1Name; danhsach[i].Bt1Name=danhsach[j].Bt1Name;danhsach[j].Bt1Name=temp2;
	String temp3=danhsach[i].Bt1Code; danhsach[i].Bt1Code=danhsach[j].Bt1Code;danhsach[j].Bt1Code=temp3;}}} 
{System.out.printf("%-20s%-15s%-10s","Họ Tên","Mã SV","DTB");System.out.println("");
for (int i=0; i<danhsach.length; i++) {
danhsach[i].Bt1HienThi();}break;// theo như code nay thi DTB se thay ddoooi con tên va ma hoc sinh se khong thay doi vi vạy muon đỏi hết moi dong bo
}

case 5: System.out.println(" Hẹn gặp lại lần sau ");Bt1Cehck=1; break;

}//else {System.out.println(" Dữ liệu nhập vào bị sai, vui lòng nhập lại");}
//	}catch (Exception e) {
 //System.out.println(" Dữ liệu nhập vào bị sai, vui lòng nhập lại e");
	}
	}// ưhile
}
}
