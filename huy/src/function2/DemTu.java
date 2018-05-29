package function2;
public class DemTu {
	public static String str = " hoc    java co ban den nang cao   "+"\n test";
	// public static final char space =' ';// kieu char 1 dau con string 2 dau kep
	// public static final char space1 ='/t';// cai nay sai / phai la \
	// public static char space2 ='/n';
	public static char SPACE = ' ';
	public static  char TAB = '\t';
	public static char BREAK_LINE = '\n';
	public static void main(String[] args) {
//		int len = str.length();
//		boolean Dem= true;
//		int DemTu=0;
//		int DemTam=0;
//		for (int i=1;i<len;i++ )
//		{ 
//			if (str.charAt(i)!=SPACE && str.charAt(i)!=TAB && str.charAt(i)!=BREAK_LINE)// chu y la char la kieu ki tu nen so sanh nhu vay se khong hieuvi vay phai khia bao char a=" "; or
//			{ //khong lam gi ca
//				//System.out.println(str.charAt(i)); break;
//				Dem=false; DemTam++;
//			} 
//			else {Dem= true; if (Dem==true && DemTam>0)
//			{ DemTu++;
//			DemTam=0;}}
			//DOAN CODE CHUAN HON
			int len = str.length();
			boolean Dem= true;
			int DemTu=0;
			int DemTam=0;
			for (int i=1;i<len;i++ )
			{ 
			if (str.charAt(i)!=SPACE && str.charAt(i)!=TAB && str.charAt(i)!=BREAK_LINE)// chu y la char la kieu ki tu nen so sanh nhu vay se khong hieuvi vay phai khia bao char a=" "; or
			    { if ( Dem==true) {DemTu++; Dem=false;}
				} 
			else Dem=true;

			System.out.println(" So tu cua chuoi tren la : "+ str.charAt(i));	
		}
		System.out.println(" So tu cua chuoi tren la : "+ (DemTu));	// so sanh bool roi cong roi gan boole den khi co khoang trang gan laij boool roin cong tiep
//		System.out.println(" So tu cua chuoi tren la : "+ str.charAt(i));	
//	}
//	System.out.println(" So tu cua chuoi tren la : "+ (DemTu+1));	// vi sau test khong co dau cachs neen khoong thuc thi tiep
		
	}
}




























