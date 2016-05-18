/*
You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
*/

import java.util.*;
import java.io.*;

class Map {
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      Map m = new HashMap();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         m.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          if (m.containsKey(s)) {
              System.out.println(s + "=" + m.get(s));
          }
          else {
              System.out.println("Not found");
          }
      }
   }
}
