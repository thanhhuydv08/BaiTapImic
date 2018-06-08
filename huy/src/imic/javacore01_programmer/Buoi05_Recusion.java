package imic.javacore01_programmer;

public class Buoi05_Recusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// tính giai thừa một số bát kỳ
System.out.println(Fibo(6));		

	}
	public static double Fibo ( int n) {
		if(n==0||n==1)	 return n;                    
		else return Fibo(n-1)+Fibo(n-2);	// về học thêm 
	}

}
/*
co bai tap 1/n.....

if n=1 return 1;
esle 1/n+ten ham(n-1)
*/