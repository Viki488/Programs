package av;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="radar";
		
		String org_str=str;
		
		String rev="";
		
		int len=str.length();
		
		
		for(int i=len-1 ; i>=0 ; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		if(org_str.equals(rev)) {
			
			System.out.println("String is Palindrome  :"  +str);
		}else {
			System.out.println("String is Not Palindrome");
		}
	}
}
