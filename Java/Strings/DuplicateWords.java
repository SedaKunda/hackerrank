/*
Using Regex, we can easily identify the repeated pattern in a given text. In this problem, you will be given a text. Your task is to identify the consecutively repeated words and delete them after the first occurrence of the word.

Complete the code in the editor to solve this problem. Don't modify any extra lines. You will get the wrong answer if you modify more than 33 lines.

To restore the original code in the editor, create a new buffer by clicking on the top-left button in the editor.

Input Format
The first line of input contains an integer NN, representing the number of testcases. The next NN lines contain a string of English letters and whitespaces.
Constraints
In each line, there will be at most 104104 English letters and whitespaces.
  1≤N≤1001≤N≤100
Output Format
Print the input string after deleting the consecutive words after the first occurrence of the word.
*/


    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class DuplicateWords
    {
        public static void main(String[] args){

            String pattern = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
            Pattern r = Pattern.compile(pattern, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String input = in.nextLine();
                Matcher m = r.matcher(input);
                boolean findMatch = true;
                while(m.find( )){
                    input = input.replaceAll(input,input.replaceFirst("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+","$1"));
                    findMatch = false;
                }
                System.out.println(input);
                testCases--;
            }
        }
    }
