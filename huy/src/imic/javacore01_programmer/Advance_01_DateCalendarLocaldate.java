package imic.javacore01_programmer;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Advance_01_DateCalendarLocaldate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10,b=15;
	String ngayAdd = "13/06/2018";
	Date date = new Date();
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
	System.out.println(df.format(date));// lay gio cua he thong va dinh dang no
	// muôn lấy ngày or giò or tháng ......vv ta dung Calendar
	Calendar calendar = Calendar.getInstance();
	System.out.println(calendar.get(Calendar.YEAR));// tach ra lay nam
	System.out.println(calendar.get(Calendar.DATE));// tach ra lay ngay
    calendar.add(Calendar.DATE,2);
	System.out.println(calendar.get(Calendar.DATE));
	System.out.println(df.format(calendar.getTime()));
// cách 2 dung local date de truy xuat ngay gio he thong
// làm lịch cá nhân	
	LocalDate sdate = LocalDate.now();
	System.out.println(sdate);// in ra ngay thng nam  hiện tại luôn
	System.out.println(sdate.getDayOfMonth());// tách ra ngày hiện tại luôn 
	System.out.println(sdate.getMonthValue());// nếu tháng bằng chữ thì ta thêm value để chuyển thành số
	int today = sdate.getDayOfMonth();// luu ngày hiện tại lại
	int month = sdate.getMonthValue();// luu tháng hiện tại lại
	sdate = sdate.minusDays(today-1);// lấy ngày đầu tiên của tháng hiện tại tức là ngày 1 rồi
	System.out.println(sdate);// cái này không còn là ngày hiện tài nữa nhé
	DayOfWeek ow = sdate.getDayOfWeek();
	int value = ow.getValue();// cái này nghiên cuu kỹ lại chua hiểm lắm mục dích gán ngày đầu tiên của tuần cho biến value
	System.out.println(value);// vi tri của tuần trong tháng
	System.out.println("Mon Tue wed Thu Fri Sat Sun");
	for(int i=1; i<value;i++) {
        System.out.print("    ");// con tro dang dung vi tri này rồi sẽ thục hiện in tiếp
	}
	int svalue =0;// gán trước biến để thực hiện lệnh if =7 do chúng ta tăng ngày sau dãn đến sẽ ngắt dòng hợp lý hơn
	while (sdate.getMonthValue()==month) {
		System.out.printf("%3d", sdate.getDayOfMonth());
		if (sdate.getDayOfMonth()==today) {
			System.out.print("*");
		}else System.out.print(" ");
		 if(svalue==7) {   // tai sao đặt so sánh ngày thứ 7 trong tuần là xuống dòng tại này, vì khi ta đặt sau cùng la 
			 System.out.println(); // lệnh ngắt trước dòng trước khi thực hiện lên in dayofmonth khi vòng lặp thứ 2 bắt đầu		                                  	
		 }
		sdate = sdate.plusDays(1);// công ngày lên 1
		DayOfWeek sow = sdate.getDayOfWeek();// tại sao phai có lệnh giống tạo đối tương sao khong gan bien svalue = sdate.get......
		svalue =sow.getValue();            // xin nói la do khong thao tac duoc khi gan bien cho doi tuong, vi vay ta tao mot bien roi get value thoi nhe
		
	}
	System.out.println();
	}
}
