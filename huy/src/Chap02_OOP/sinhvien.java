package Chap02_OOP;

public class sinhvien {
public static String name;
public static String codeStudent;
public static int birthday;
// dung to hop phim alt+ shift + s click seter .....
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCodeStudent() {
	return codeStudent;
}
public void setCodeStudent(String codeStudent) {
	this.codeStudent = codeStudent;
}
public  int getBirthday() {
	return birthday;
}
public  void setBirthday(int birthday) {
	this.birthday = birthday;
}

public  void inputScreen() {// khoong bo static nhe
	System.out.println(" -----------------------------------------");
	System.out.println(" | Tên : "+getName()); // bat buoc dung this. vi ip. khong hiêu vi ip duoc khai bao trong ham main cua class khac
	System.out.println(" | Mã sinh viên : "+getCodeStudent());
	System.out.println(" | Ngày Sinh : "+ getBirthday());	
}
}
