package function2;

import java.util.Scanner;

public class Solanxuathientrongchuoi {

	public static void main(String[] args) {
		int lenChuoi1, dem=0;
		//boolean checkinput = false;
		//while (checkinput!=true) {
		//try	{
		String string="";
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Nhap chuoi du lieu tu ban phim inputString =");
		string =sc.nextLine();
		lenChuoi1= string.length();
		System.out.println(lenChuoi1);
		char[] arr1=string.toCharArray();
		int [] arr3=new int [lenChuoi1];// đếm tu o len cao nen phai la kieu int nhe
		for (int f=0;f<lenChuoi1;f++) {arr3[f]=1;}
		char [] arr2=new char[lenChuoi1];
		for (int k=0;k<lenChuoi1;k++) {arr2[k]=1;}
		for (int i=0; i<lenChuoi1;i++)
		{     dem=1;
			if(arr2[i]==1)
			{    arr2[i]=0;
			    for (int j=i+1;j<lenChuoi1;j++)
			       {if(arr1[i]==arr1[j]) 
					    {  dem++;
					       arr3[i]=arr3[i]+1;
					       arr2[j]=0;		
					     }  
			
					}
			    /////////////////////// phan nay in ra cac kys tu va so lan xuat hien

			}
			 				
		}
		  // vong lap nay de tim gia tri max
	        int  max=1;
		    for(int i=0;i<arr3.length;i++)// gan gia tri max trong mang arr3 
      	  {if (arr3[i]>max) {max=arr3[i];}	
      	  }// vong lap nay de tim ky tu cua gia tri max va xuat ra
		    for(int i=0;i<arr3.length;i++)
		    {if (arr3[i]==max) {System.out.println(" phan tu "+arr1[i]+" xuat hien "+max);}
		    }		

}//main
}//cals
