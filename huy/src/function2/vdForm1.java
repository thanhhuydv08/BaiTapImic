package function2;
//
import java.awt.BorderLayout;
//import java.util.FormatFlagsConversionMismatchException;
import java.awt.EventQueue;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vdForm1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtdonGia;
	private JLabel lblSLng;
	private JTextField txtsoLuong;
	private JTextField txttinhTong;
	private JTextField txtDec;
	private JTextField txtBin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vdForm1 frame = new vdForm1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vdForm1() {
		setTitle("T\u00EDnh s\u1ED1 ti\u1EC1n chi tr\u1EA3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdonGia = new JTextField();
		txtdonGia.setBounds(85, 11, 86, 20);
		contentPane.add(txtdonGia);
		txtdonGia.setColumns(10);
		
		JLabel lblnGi = new JLabel("So DEC");
		lblnGi.setBounds(214, 14, 75, 14);
		contentPane.add(lblnGi);
		
		lblSLng = new JLabel("S\u1ED1 L\u01B0\u1EE3ng");
		lblSLng.setBounds(0, 45, 59, 14);
		contentPane.add(lblSLng);
		
		txtsoLuong = new JTextField();
		txtsoLuong.setColumns(10);
		txtsoLuong.setBounds(85, 42, 86, 20);
		contentPane.add(txtsoLuong);
		
		JLabel lbl1 = new JLabel("T\u1ED5ng Ti\u1EC1n");
		lbl1.setBounds(0, 80, 59, 14);
		contentPane.add(lbl1);
		
		JButton btnTnhTng = new JButton("T\u00EDnh t\u1ED5ng");
		btnTnhTng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			// cac form la dang text toàn bộ nên khi dunhf công thức tính toán số sẽ không hiểu nên ta sẽ chuyển chuỗi sang kiểu số nào đó 
				double donGia,soLuong,tinhTong;
				donGia=Integer.parseInt(txtdonGia.getText());
				soLuong =Integer.parseInt(txtsoLuong.getText());
				tinhTong= donGia*soLuong;
				String tinhTongtxt = String.valueOf(String.format("%.2f",tinhTong));//
				txttinhTong.setText(tinhTongtxt);
			}
		});
		btnTnhTng.setBounds(82, 126, 89, 23);
		contentPane.add(btnTnhTng);
		
		txttinhTong = new JTextField();
		txttinhTong.setColumns(10);
		txttinhTong.setBounds(85, 73, 86, 20);
		contentPane.add(txttinhTong);
		
		txtDec = new JTextField();
		txtDec.setColumns(10);
		txtDec.setBounds(309, 11, 86, 20);
		contentPane.add(txtDec);
		
		JLabel label = new JLabel("Đơn giá");
		label.setBounds(0, 14, 75, 14);
		contentPane.add(label);
		
		JLabel lblSoBin = new JLabel("So Bin");
		lblSoBin.setBounds(214, 60, 75, 14);
		contentPane.add(lblSoBin);
		
		txtBin = new JTextField();
		txtBin.setEnabled(false);
		txtBin.setColumns(10);
		txtBin.setBounds(309, 57, 86, 20);
		contentPane.add(txtBin);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	int number_Dec , number_Bin;
	String exnumber_Dec="";		
	number_Dec=Integer.parseInt(txtDec.getText());
	while (number_Dec/2!=0) {
		int a=number_Dec%2;
		exnumber_Dec=exnumber_Dec+String .valueOf(a);
		number_Dec=number_Dec/2;
	}
		
	exnumber_Dec=exnumber_Dec+1;//cong chuoi cho 1 vi phan nguyen toi so 0 thi vong lap dung lai khong lay phan du cua 1/2
	String  reverse = new StringBuffer(exnumber_Dec).reverse().toString();
	txtBin.setText(reverse);	
		
				
			}
		});
		btnChange.setBounds(306, 126, 89, 23);
		contentPane.add(btnChange);
	}
}
