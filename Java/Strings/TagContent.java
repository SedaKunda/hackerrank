/*
Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

Tags can consist of any printable characters.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContent{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();
         String pattern= "(<)(.+)(>)([-\\w!@\\$%^&#\\*()_+|~=`\"\\{\\}\\[\\]:'\\, ]+)(</)(\\2)(>)";
         Pattern r = Pattern.compile(pattern, Pattern.MULTILINE);
         Matcher m = r.matcher(line);
         if (m.find()) {
        	 do {
        	 System.out.println(m.group(4));
        	 }
        	 while (m.find());
         }
         else {
        	 System.out.println("None");
         }
         testCases--;
      }
   }
}
