import java.util.ArrayList;


public class driver {

	
	public static ArrayList<String> stringLengths(ArrayList<String> a){
		ArrayList<String> words=a;
		ArrayList<String> initwords=a;
		int num=initwords.get(1).length();
		for(int i=0;i<num;i++){
			for(int x=0;x<initwords.size();x++){
				String b=initwords.get(x).substring(0, initwords.get(1).length()-i);
				words.add(b);
				initwords.set(x, b);
			}
		}
		return words;
		//find all possible lengths of string
	}
	
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
	permutation("ABCD", allStrings);
	allStrings=stringLengths(allStrings);
	System.out.println(allStrings.toString());
	}

}
