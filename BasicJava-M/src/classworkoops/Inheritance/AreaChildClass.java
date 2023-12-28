package classworkoops.Inheritance;

public class AreaChildClass extends AreaBaseClass {
	
	static int newVar = 30;
	
	public void newVariableMethod(){
		System.out.println(newVar);
	}
	
	public static void main(String[] args) {
		
		AreaChildClass childObj = new AreaChildClass();
		childObj.side = 11;
		childObj.radius = 5.5f;
		childObj.areaOfCircle();
		childObj.areaOfSquare();
		childObj.length = 20;
		childObj.breath = 30; //giving error
		childObj.rectarea = 30;
		childObj.areaofRectangle();
		childObj.areaofRectangle1();
		childObj.areaofRectangle2();
	//	childObj.areaofRectangle3(); gives error since areaofRectangle3() is private method which can be accessed with in the class
	//	System.out.println(childObj.newVar);
		
		System.out.println("******************************");
		childObj.areaofRectangle4();
	}

}
