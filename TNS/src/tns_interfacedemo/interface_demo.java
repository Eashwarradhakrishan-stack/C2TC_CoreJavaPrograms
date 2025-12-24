package tns_interfacedemo;
interface inter{
}
public class interface_demo {
 private static interface_demo obj;
 static void show() {
	 System.out.println("HI IM AIZEN");
	 
 }
public static void main(String[]args) {
	setObj(new interface_demo());
	interface_demo.show();
}
public static interface_demo getObj() {
	return obj;
}
public static void setObj(interface_demo obj) {
	interface_demo.obj = obj;
	System.out.println("name of the king");
}
}