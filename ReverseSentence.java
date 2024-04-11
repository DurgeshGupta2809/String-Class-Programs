package StringClass;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String s="How are you";
		
		String str[]=s.split(" ");
		String str1="";
		
		for(int i=0; i<str.length; i++) {
			
			if(i==0) {
				str1=str1+str;
			}
			else {
				str1=str1+" "+str;
			}
			
		}
		System.out.println(str1);
	}

}
