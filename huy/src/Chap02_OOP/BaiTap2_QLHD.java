package Chap02_OOP;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class BaiTap2_QLHD {
	
	public static void main(String[] args) {
	BaiTap2_people[]  danhsach=null;
    BaiTap2_Quarter[]  danhsach1=null;	
	
		// TODO Auto-generated method stub
    Scanner sc1 = new Scanner(System.in);
    int check = 1;
    int menu;
    while (check!=0) {
   System.out.println("-----------------------------Quan ly Ho Dan trong khu Pho--------------------------");
   System.out.println("-----------------------------------------------------------------------------------");
   System.out.println("|1. Nhap thong tin cua cac thanh vien trong khu pho.                               |");
   System.out.println("|2. Hien thi thong tin cac thanh vien trong khu pho.                               |");
   System.out.println("|3. Thoat chuong trinh                                                             |");
   System.out.println("-----------------------------------------------------------------------------------");
   
   // tam thoi khong dung try cath de bat su kien nhp vao sai thuoc tinh
	   System.out.println(" Moi Ban nhap vao lua chon : ");
	   menu = Integer.parseInt(sc1.nextLine());
	   if (1<=menu|| menu <=3)
	   {	switch (menu) {
	   case 1:
	   {System.out.println(" Moi ban nhap so ho dan trong khu pho can them vao :");// vi trong phan nhap tt co so thanh vien nen ta se lay bien trong nhap thong tin luon
	   //BaiTap2_Quarter sc2 = new BaiTap2_Quarter();
	   //BaiTap2_people sc3 = new BaiTap2_people();
	   int n= Integer.parseInt(sc1.nextLine());
	   // danhsach = new BaiTap2_people[n];
	   danhsach1 = new BaiTap2_Quarter[n];// chu ys [n] nhe ko phai (n)
	   for (int i=0; i<danhsach1.length; i++) {
		   //danhsach [i]= new BaiTap2_people();
		   danhsach1[i] = new BaiTap2_Quarter();
		   danhsach1[i].NhapTT();
		   //System.out.println(danhsach1[i].hoTen+danhsach1[i].soNha);// vi vay rut ra kinh nghiem la viet ham nhp tu hm con vd nhung thay vi goi ham nhap cua phuong thuc people roi quarter ta goi chi moi quater con trong phuong thuc nhapTT cua qarter ta goi ham nhap cua people
	   } 

	   break;
	   }
	   case 2: {
		   System.out.println(danhsach1.length);
		   System.out.printf("%-20s%-15s%-20s%-15s","Họ Tên","Ngay sinh","Nghe Ngiep","Dia Chi");System.out.println("");
		   for (int i=0; i<danhsach1.length; i++) {
			   // danhsach [i]= new BaiTap2_people();
			   //danhsach1[i] = new BaiTap2_Quarter(); // chu y neu to doi tuong thi se bi reset o nho het cac thong tin vua nhap case 1
			   //System.out.println(danhsach1[i].hoTen);
			   //    danhsach[i].XuatTT();
			   danhsach1[i].XuatTT();
		   }
	   }break;


	   case 3:check=0;

	   }
	   }else System.out.println(" Du lieu nhap vao khong dung , vui long nhap lai");
   }

	}

}

