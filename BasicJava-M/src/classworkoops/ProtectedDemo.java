package classworkoops;

import classworkoops.Inheritance.AreaBaseClass;
import classworkoops.Inheritance.AreaChildClass;

public class ProtectedDemo extends AreaBaseClass {

	public static void main(String[] args) {
		
		ProtectedDemo childObj = new ProtectedDemo();
	//	childObj.side = 11; side has default access/no access modifier so cannot be accessed outside the package
	//	childObj.radius = 5.5f; radius has default access/no access modifier so cannot be accessed outside the package
		childObj.areaOfCircle();
		childObj.areaOfSquare();
		childObj.length = 20;
		childObj.breath = 30; //breath is private access modifiers are working
		childObj.rectarea = 30;// Able to access rectarea variable since it has protected modifier and that class is extended to this class
		childObj.areaofRectangle();
	}

}
