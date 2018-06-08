package imic.javacore01_programmer;

public class Advance_01_Class_Submain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advance_01_Class_Submain_01 sc = new Advance_01_Class_Submain_01();
		int check=5;
		Advance_01_Class_Submain_01[] sSave = null;
		sSave = new Advance_01_Class_Submain_01[2];
		for (int i=0; i<sSave.length; i++) {
		sSave[i]= new Advance_01_Class_Submain_01();
		sSave[i].nhapTT();		
	    }
		System.out.printf("%-20s%-20s%-10s","Ten","Nam Sinh","Tuoi");
		for (int j=0; j< 4; j++) {
			sSave[j].xuatTT();	// chir goi 1 lenh thoi nha neu sSave[i]= new Advance_01_Class_Submain_01(); nua la bi null het	
		}
}
}
