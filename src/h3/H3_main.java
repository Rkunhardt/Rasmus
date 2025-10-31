package h3;

public class H3_main {
	 static int i = 11;
	    static int j = 2;
	    static int k = 1;
	    static boolean eins = false;
	    static boolean zwei = false;
	    static boolean drei = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(i>j) {
	        eins = true;
	    }
	    if(i>200) {
	        zwei = true;
	    }
	    if(j>100) {
	        drei = true;
	    }
	    k = -10;
	    if(eins == true && zwei == false && drei == false) {
	        k = 1;
	    }
	    if(eins == true && zwei == true && drei == false) {
	        k = 2;
	    }
	    if(eins == true && zwei == true && drei == true) {
	        k = 3;
	    }
	    if(eins == false && zwei == false && drei == false) {
	        k = 4;
	    }
	    System.out.println(k);

	}

}
