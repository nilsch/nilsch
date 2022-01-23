package task.logiq;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		Capitalize cp = new Capitalize();
		Palindrome pd = new Palindrome();
		Reverse re = new Reverse();
		UniqueCount uc = new UniqueCount();
		Whitespace ws = new Whitespace();
		
		Worker w = new Worker();
		w.addJob("CAPITALIZE", cp);
		w.addJob("PALINDROME", pd);
		w.addJob("REVERSE", re);
		w.addJob("UNIQUE_COUNT", uc);
		w.addJob("WHITESPACE", ws);
		
		w.handleString();
		
	}
}
