package classworkjava;

import classworkoops.AccessModifier;
public class AccessingOutSidePackage {

	public static void main(String[] args) {
		
	AccessModifier p = new AccessModifier();
	
	System.out.println(p.city);
	System.out.println(p.newColony());

	}

}
