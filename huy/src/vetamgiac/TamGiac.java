package vetamgiac;

import java.util.Scanner;

public class TamGiac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao so hàng của tam giac:");
		int n= Integer.parseInt(sc.nextLine());
		
      for (int i=0; i<=n;i++) {
					//Scanner sc = new Scanner(System.in);
					//System.out.print("nhap vao so thu 1:");
					int a= Integer.parseInt(sc.nextLine());
					int check =0;
					switch (a) {
					case 1 : for (int j=0;j<=n+3; j++) { 
						if(check!=(n+3)) {System.out.print(" "); check++;} else {System.out.print(a);System.out.println();}
					} break;
					case 2 :for (int k=0; k<=n+4;k++) {
						if(check!=(n+2)&&check!=(n+3)&&check!=(n+4)) {System.out.print(" "); check++;} else {System.out.print(a);}	 
					}System.out.println();break;
					
					}
      }		
	}
}

