package task.logiq;

public class Whitespace implements StringHandling {

	@Override
	public String handle(String str) {
		return  str.replaceAll("\\s", "");
	}
}
