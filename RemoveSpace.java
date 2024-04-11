package StringClass;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s="  Hello World ";
		String s1="";
		int start=0;
		char ch[]=s.toCharArray();
		int end=ch.length-1;
		
		for(int i=0; i<ch.length; i++) {
			
			if((ch[i]==' '&&ch[start]==' ') && (ch[i]==' '&&ch[end]==' ')) {
				start ++;
			}
			else {
				s1 = s1 + ch[i];
			}
		}
         System.out.println(s1);
	}

}
