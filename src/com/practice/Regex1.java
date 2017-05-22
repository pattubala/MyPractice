/**
 *  Program for to understand regular expression
 */
package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Lokesh
 */
public class Regex1 {

	public static void main(String[] args) {
		
		Pattern p= Pattern.compile("..r");
		Matcher m= p.matcher("pqr");
		boolean b=m.matches();
		System.out.println(b);
		
	}

}
