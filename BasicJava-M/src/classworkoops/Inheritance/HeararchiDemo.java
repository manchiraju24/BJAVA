package classworkoops.Inheritance;

public class HeararchiDemo extends AreaBaseClass {

	public static void main(String[] args) {
		
		HeararchiDemo childObj = new HeararchiDemo();
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
	}

}
