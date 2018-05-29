package function2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class chuyenkieubien {
	private static Scanner typename;
	 String name1;//bieens instance
	static String name2;
	public void getname(String name1) {
		this.name1=name1;	
				}
	public String setname() {
		return name1;	
				}
	public static void main(String [] args) {
		String s="1000";	
		int i= Integer.parseInt(s);//chuyen kieu chuoi sang kieu so nguyen 
		float l=i;
		double k=l;
		int m=i+50;
		String n=Integer.toString(m);//or String n=String.valueof(m); chuyen int sang chuoi
		String e=n+50;// chuoi + them 50 la nối chuỗi
		System.out.println("kieu so nguyen " +i);
		System.out.println("kieu so thuc " +l);
		System.out.println("kieu so thuc " +k);
		System.out.println("kieu chuỗi " +n);
		System.out.println("kieu chuỗi " +e);
	// chuyen string sang date	
	String Sdate="27-11-1990"	;
	SimpleDateFormat date= new SimpleDateFormat("dd-mm-yyyy");
	try {
		Date cdate = date.parse(Sdate);
		System.out.println("kieu date " +cdate);
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	
	// nhap tu bn phim 1 chuoi
	typename = new Scanner(System.in);
	String str = typename.next();	
	System.out.println(str);
	// gan gia tri cho 1 bien bang h
	chuyenkieubien sname=new chuyenkieubien();
	sname.getname("nguyen thanh huy");
	String kq=sname.setname();
	System.out.println(" toi ten la :"+kq);
	getname1();//neu ta xuat ra la bi loi vi vay chi goi ham thoi con len ham in ra man hinh vi void ko co gia tri tra ve
	
	}
	//////////////////////truy xuat xem void co tra du lieu ko
	
	//String kq1=sname.setname();
/*(	System.out.println(" toi ten la :"+sname.getname1());	//nhu vay la ko dc 	
		}	*/
	//thay vi do ta thuc hien len xuat ra man hinh trong ham getname1 luon
	public static void getname1() {
		 name2="huyhuyhuy";
		System.out.println(" truy xuat ham void"+name2);
	}	
	
	
}
