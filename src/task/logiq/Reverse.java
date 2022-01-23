package task.logiq;

public class Reverse implements StringHandling {

	@Override
	public String handle(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length() -1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
}
