package function2;

public class tapLam2 {
int age;
String name;// xut ten va tuoi

public void getname(String name) {
this.name=name;	
}

public void getage(int age) {
this.age=age;	
}

public void showname() {
	
	System.out.println(" Toi ten la :" + name);
	System.out.println(" Toi ten la :" + age);
}

public static void main (String[] agrs) {
	tapLam2 sv =new tapLam2();
	sv.getname("nguyen thanh huy");
	sv.getage(29);
	sv.showname();
	

}
	
	
	
	
	
	
}
