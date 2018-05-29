package Chap02_OOP;

public class Class_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// xuat ten sinh vien co cac dat diem va hanh dong
//	sinhvien sc = new sinhvien(); // tao moi doi tuong
//	sc.birthday= 1990;
//	sc.name=" Nguyễn Thành Huy";
//	sc.codeStudent="271190";
	// 3 lenh nay de gan du lieu vao truong hop ko co set va get;
	  
//System.out.println(" -----------------------------------------");
//System.out.println(" | Tên : "+sc.name);
//System.out.println(" | Mã sinh viên : "+sc.codeStudent);
//System.out.println(" | Ngày Sinh : "+sc.birthday);

// truong hop ta dung get va set tai class sinh vien thi sao
// cách 2 them get va set

//sinhvien ip = new sinhvien();
//ip.setName("Đào thị Minh Hảo");
//ip.setBirthday(1991);
//ip.setCodeStudent(" 280690");
//System.out.println(" -----------------------------------------");
//System.out.println(" | Tên : "+ip.getName());
//System.out.println(" | Mã sinh viên : "+ip.getCodeStudent());
//System.out.println(" | Ngày Sinh : "+ip.getBirthday());

// hoat tat chuong trinh chay ok
// nhung thay vi code qua dai dong phan in r man hinh ta chi can goi ham thoi 
// ta // dong 14-17 de code moi  va dong 26-29 

		sinhvien ip = new sinhvien();
		ip.setName("Đào thị Minh Hảo");
		ip.setBirthday(1991);
		ip.setCodeStudent(" 280690");
		ip.inputScreen();// goi ham khac nam trong clss sinhvien
		ip.setName(" Nguyên Thành Huy");
		ip.setBirthday(1990);
		ip.setCodeStudent(" 271190");
		ip.inputScreen();// goi ham khac nam trong clss sinhvien
		// chu y truong hop la static tai ham input ( chu y ham get va set cug phai dua ve static nhe )thi ko can tao doi tuong cung truy xuat duoc bang lenh sinhvien.input...
		
		
	}

	
}
