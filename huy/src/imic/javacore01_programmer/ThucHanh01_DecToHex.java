package imic.javacore01_programmer;

public class ThucHanh01_DecToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecToHex(2000);
	}
public static void DecToHex(int a) {
	int i=0;int b=a;
	int [] danhSach = new int [100];
	while (a/16!=0) {
	danhSach[i]=a%16;
	a=a/16;
	//System.out.println(danhSach[i]);
	i++;
	}
	System.out.print(" Chuyen so Dec sang Hex : " + Integer.toHexString(a));
	for (int k=i-1;k>=0;k--)	{
	System.out.print(Integer.toHexString(danhSach[k]));	
	}
}
}

