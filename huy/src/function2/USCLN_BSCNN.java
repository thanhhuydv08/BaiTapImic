package function2;
import java.util.Scanner;
public class USCLN_BSCNN {
	static int a,b,n,i;
	
public  static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc=new Scanner(System.in);
	System.out.print("Nhap vao 2 so nguyen:");
	a=sc.nextInt();
	b=sc.nextInt();		
		
	for( i=b-1;i>1;i--)
					{ if(b%i==0) { if(a%i==0) { System.out.println(" Uoc so chung lon nhat la:"+i); i=n; break;} }
	               
					}
	if(i-1==0) {System.out.println(" Khong co uoc so chung lon nhat");}


}
}