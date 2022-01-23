package task.logiq;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCount implements StringHandling {

	@Override
	public String handle(String str) {

		Map<Character, Integer> map = new HashMap<>();
		int counter = 1;
		for (int i = 0; i < str.length() ; i++) {
			var c = str.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, counter);
			}else {
				map.put(c, (map.get(c) + 1));
			}
		}

		return String.valueOf(
				map.entrySet().stream()
				.filter(e -> !Character.isWhitespace(e.getKey()))
				.filter(e -> e.getValue() == 1)
				.collect(Collectors.counting()));
	}
}
