//create a package using a package name
package abc1;


public class test {
//main method
	public static void main(String[] args) {
		
class2 ob= new class2();//object creation
ob.show();//calling show method defined in class 2 by creating its object
System.out.println("world");

	}

}
class class2{
	void show() {
		System.out.println("hello");
		
	}
	
}
