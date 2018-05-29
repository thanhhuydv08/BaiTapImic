package function2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_canlendar {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");	
		Calendar calendar= Calendar.getInstance();
		//Calendar calendar= new GregorianCalendar(2017,11,20);
		calendar.add(Calendar.MONTH, 5);
		System.out.println(" So ngay sau khi cong them 5 la: "+ df.format(calendar.getTime()));

		String dateChuoi= " 20/11/2017";

		try {
			Date convertChuoi = df.parse(dateChuoi);//
			System.out.println(" lay ngay trong string :"+df.format(convertChuoi));// bien df.format(convertChuoi) la kieu String
			// Calendar c = df.format(convertChuoi);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
}



}
}
