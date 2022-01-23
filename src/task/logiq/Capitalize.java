package task.logiq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Capitalize first letter in a word and rest of the word to lower letters.
 * @author chnil
 *
 */
public class Capitalize implements StringHandling {

	@Override
	public String handle(String str) { 
	      
        Pattern p = Pattern.compile("\\w+"); // A word character: [a-zA-Z_0-9]
        Matcher m = p.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
        	var s1 = m.group();
        	// TODO search for the first letter if the word start on _ or 0-9
            m.appendReplacement(sb, String.valueOf(s1.charAt(0)).toUpperCase() + s1.substring(1).toLowerCase());
        }
        
        return sb.toString();
	}
}
