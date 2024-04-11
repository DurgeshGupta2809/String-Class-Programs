package StringClass;

import java.util.Arrays;

public class RemoveDuplcate {

	public static void main(String[] args) {
		
		String s1="abcdefghijk lmnopqr stuvwxyzabc";
		String s2="";
		int count=0;
		char[]ch1=s1.toLowerCase().toCharArray();
		char[]ch2=s2.toLowerCase().toCharArray();
		
		for(int i=0; i<ch1.length; i++) {
			for(int j=i+1; j<ch1.length; j++) {
			  if(ch1[i]==ch1[j]&&ch1[i]!='#') {
					ch1[j]='#';
				}
			}
		}
	for(int i=0; i<ch1.length; i++) {
    	//System.out.println(ch1[i]);
     }
    for(int i=0; i<ch1.length; i++) {
    	if(ch1[i]>='a'&&ch1[i]<='z') {
    		count++;
    		
    	}
     }
   // System.out.println(s2);
	 
    char[] ch3=s2.toCharArray();
	
		
		if(count==26) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not Panagram");
		}
	
	
		
	}
}
