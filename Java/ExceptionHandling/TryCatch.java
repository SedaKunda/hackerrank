/*
This problem will test your knowledge on try-catch block.

You will be given two integers xx and yy as input, you have to compute x/y. If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TryCatch {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        try {
            int y = in.nextInt();
            int z = in.nextInt();
            int r = y/z;
            System.out.print(r);
        }
        catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        }
        catch (Exception e) {
            System.out.print(e);
        }
       
    }
}
