package it.d0ge01.ncomplex.parser;


import java.util.regex.*;

public class Parser {
	
	public int[] parser(String buff) {
		int[] ret = new int[2];
		
		Pattern p;
		Matcher m;
		
		if ( buff.matches("\\d+ \\D \\d+i")  ) {
			p = Pattern.compile("(\\d+) \\D{1} (\\d+)i");
			m = p.matcher(buff);
			
			while(m.find()) {
				ret[0] = Integer.parseInt(m.group(1));
				ret[1] = Integer.parseInt(m.group(2));
			}
		} else if ( buff.matches("(\\d+)cos (\\d+) \\D. (\\d)+sin (\\d+)") ) {
			System.out.println("2 caso :D");
		}
		
		return ret;
	}
}
