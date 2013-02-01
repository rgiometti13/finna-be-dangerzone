import java.util.ArrayList;


public class driver {

	public  static void permutation(String str, ArrayList<String> a) { 
	    permutation("", str, a); 
	}

	 private static void permutation(String prefix, String str, ArrayList<String> a) {
	    int n = str.length();
	    if (n == 0){
	    System.out.println(prefix);
	    a.add(prefix); 
	    }
	    	else {
	        for (int i = 0; i < n; i++)
	           permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), a);
	    }

	}

	public static void main(String[] args) {
	ArrayList<String> allStrings = new ArrayList<String>();
	permutation("AB", allStrings);
	System.out.println(allStrings.toString());
	System.out.println(allStrings.get(1));
	}

}
