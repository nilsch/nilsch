package task.logiq;

public class Palindrome implements StringHandling {

	@Override
	public String handle(String str) {
		var isP = isPalindrome(str);
		
		return String.valueOf(isP);
	}
	
	private boolean isPalindrome(String str) {
		var end  = str.length() - 1;
		var half = str.length()/2; 
		
		for (int i = 0; i < half; i++, --end) {
			if(str.charAt(i) != str.charAt(end)) {
				return false;
			}
		}
		return true;
	}
}
