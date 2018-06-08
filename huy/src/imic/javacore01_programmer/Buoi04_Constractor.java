package imic.javacore01_programmer;

import java.util.Scanner;

public class Buoi04_Constractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hằng số
		final int hangSo = 100; // khai báo hằng số không thay đổi suot quá trình tính toán
		/*	 nhap tu bn phim 1 gia tri năm x bất kỳ, thực hiện kiểm tra năm đó nhuận hay không biết rằng năm nhuận 
		th�?a đi�?u kiện chia hết 4 va không chia 
		hết cho 100,hoặc chia hết cho 400 in ra true hay fale
		 */
		int check =0;
		while (check==0) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap vào số thứ 1 : ");
			int a = sc.nextInt();
			System.out.print("Nhap vào số thứ 2 : ");
			int b = sc.nextInt();
			// co the su dung ham math.min(a,b)
			if(a>b)	{for ( int i=b;i>0;i--) {
				if(a%i==0&&b%i==0) {System.out.println("GCD:" +i); break;}
			}

			}else if(a<b){for ( int i=a ;i>0;i--) {
				if(a%i==0&&b%i==0) {System.out.println("GCD:" +i); break;}			
			}
			}

		}
	}
	
}
