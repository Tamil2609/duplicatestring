import java.io.*;
import java.lang.*;
import java.util.*;
class duplicatestring
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        String str="aaaaddfbhbfghdof";
        char[] strArray = str.toCharArray();
        for (char c : strArray)
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
            Set<Character> Keys=charCountMap.keySet();
            for(Character c :Keys)
            {
                if(charCountMap.get(c)>1)
                 {
                     System.out.println(" Duplicate character "+c+" repeating "+charCountMap.get(c)+"times");
                 }
            }
        
    }
    
}