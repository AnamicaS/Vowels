package vowels;

public class Vowels {
	public static void main(String[] args) {
		String str="ajdhshuhfwekmcaaeSHIiou1232";
		String str1=" ";
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				
				System.out.print(str1+c);
				
			}
		}
		
	}

}
