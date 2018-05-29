package function2;

public class bienstatic{
static int age;
static String name;// xut ten va tuoi

public static void getname() {
 name= "nguyen thanh huy";	
}

public static void getage() {
age=21;	
}

public static void showname() {
	
	System.out.println(" Toi ten la :" + bienstatic.name);
	System.out.println(" Toi ten la :" + bienstatic.age);
}

public static void main (String[] agrs) {
bienstatic.getname();
bienstatic.getage();
bienstatic.showname();	
}
}