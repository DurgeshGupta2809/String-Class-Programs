
package StringClass;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		
		String s="skill";
		String s1="kills";
		
		if(s.length()==s1.length()) {
		char []s2=s.toLowerCase().toCharArray();
        char []s3=s1.toLowerCase().toCharArray();
        
		Arrays.sort(s2);
		Arrays.sort(s3);
		
		if(Arrays.equals(s2, s3)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
        }
	  }
		else {
			System.out.println("Not Anagram");
		}
	}

}
