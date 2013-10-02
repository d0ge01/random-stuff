package it.d0ge01.ncomplex.parser;


import it.d0ge01.ncomplex.util.*;
import java.util.regex.*;

public class Parser {
	
	public int[] parser(String buff) {
		int[] ret = new int[2];
		int c = 0;
		
		Pattern p;
		Matcher m;
		
		if ( buff.matches("\\d+ \\D \\d+i")  ) {
			System.out.println("1 caso :D");
			p = Pattern.compile("(\\d+) \\D{1} (\\d+)i");
			m = p.matcher(buff);
			c = 0;
			
			while(m.find()) {
				System.out.println("found a " + m.group());
				ret[0] = Integer.parseInt(m.group(1));
				ret[1] = Integer.parseInt(m.group(2));
			}
		} else if ( buff.matches("(\\d+)cos (\\d+) \\D. (\\d)+sin (\\d+)") ) {
			System.out.println("2 caso :D");
		}
		
		return ret;
	}
}
