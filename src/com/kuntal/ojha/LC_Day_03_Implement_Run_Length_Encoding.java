package com.kuntal.ojha;
// Implement Run Length Encoding
// Website Link:
public class LC_Day_03_Implement_Run_Length_Encoding {
    public String encoding(String toEncode)
    {
        int consecutiveCharCount =1;
        StringBuilder encodeString = new StringBuilder();
        for (int currentChar = 1; currentChar <= toEncode.length() ; ++currentChar) {
           if (currentChar == toEncode.length() || toEncode.charAt(currentChar) !=toEncode.charAt(currentChar-1))
           {
               encodeString.append(consecutiveCharCount);
               encodeString.append(toEncode.charAt(currentChar-1));
               consecutiveCharCount = 1;
           }
           else
           {
               ++consecutiveCharCount;
           }
        }
        return encodeString.toString();
    }

    public static void main(String[] args) {
        LC_Day_03_Implement_Run_Length_Encoding lc_day_03_implement_run_length_encoding= new LC_Day_03_Implement_Run_Length_Encoding();
        String testcase1 ="AAAAABBBBDDDD";
        System.out.println("RLE of "+testcase1+":\n"+lc_day_03_implement_run_length_encoding.encoding((testcase1)));
    }
}
