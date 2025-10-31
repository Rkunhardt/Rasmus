package h2;

public class H2_main {
	static int i = 1;
    static int j = 11;
    static int k = 10;
    static int min;
    static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(i>j && i>k)  {
	        max = i;
	    }
	    if(i<j && i<k) {
	        min = i;
	    }
	    if(j>i && j>k)  {
	        max = j;
	    }
	    if(j<i && j<k) {
	        min = j;
	    }
	    if(k>j && k>i)  {
	        max = k;
	    }
	    if(k<j && k<i) {
	        min = k;
	    }
	    System.out.println(max);
	    System.out.println(min);
	}

}
