package imic.javacore01_programmer;

public class Buoi05_ArrayStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int  LENARRAY =5;
	double [] danhSach = new double [LENARRAY];
// chèn số ngẫu nhiên vào mảng
Printer(danhSach);	// tại sao truyền vao mảng vi phương thức khai double [] kiểu mảng nhé
	
	}
private static void Printer (double [] list) {
	for (int i=0; i<list.length; i++) {
		list[i]=Math.random() ;// gán số ngãu nhiên	
		System.out.println(list [i]);
	}
}
}
