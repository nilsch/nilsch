package task.logiq;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Worker {

	private Map<String, StringHandling> listOfActions = new HashMap<>();

	public void addJob(String action, StringHandling job) {
		listOfActions.put(action, job);
		
	}

	public void handleString() throws IOException {
		try (Stream<String> stream = Files.lines(Paths.get("actiontexts.txt"))) {
			stream.forEach(s -> { 
				var sa = s.split(":");
				
				String action = sa[0];
				String word = sa[1];
				var result = listOfActions.get(action).handle(word);
				
				System.out.format("Text: [%s] ran Action: [%s] with result: [%s]\n",  word, action, result);
			});
		}
	}
}
