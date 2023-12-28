package classworkjava;

public class ForEach {

	public static void main(String[] args) {
		
		int[] i;
		i = new int [5];
		
		int[] j;
		j = new int[6];
		
		i[1] = 20;
		i[2] = 30;
		i[0] = 40;
		i[3] = 50;
		i[4] = 60;
		
		j[0] = 10;
		j[1]= 80;
		j[2]= 90;
		
		for(int t : i){
			System.out.println(t);	
		}
		System.out.println("**************");
		for(int t : j){
			System.out.println(t);
		}
		
		String[] h;
		h = new String [2];
		
		String[] n;
		n = new String[3];
		
		String[] e ={"nirupam" , "nihal" ,"maruthi"};
		System.out.println(e[1]);
		System.out.println(e[0]);
		System.out.println("**************");
		for(String k: e){
			System.out.println(k);
		}
	}

}
