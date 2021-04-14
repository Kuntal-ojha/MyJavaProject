package com.kuntal.ojha;
// Longest Common Prefix
// Website Link: https://leetcode.com/problems/longest-common-prefix/
public class LC_Day_02_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strings)
    {
        /**
         * This function computes the longest common prefix.
         * This take string array an input
         * we are using variable "prefixLen" to keep of
         * prefix we computed.
         */
        if (0 == strings.length)
        {
            return "";
        }
        for (int prefixLen = 0; prefixLen <strings[0].length() ; prefixLen++) {
            char toMatch =strings[0].charAt(prefixLen);
            for (int i = 1; i <strings.length ; i++) {
                if (prefixLen >=strings[i].length() || strings[i].charAt(prefixLen) != toMatch)
                {
                    return strings[0].substring(0,prefixLen);
                }
            }

        }
        return strings[0];
    }
    public static void main(String[] args) {
        LC_Day_02_Longest_Common_Prefix lc_day_02_longest_common_prefix =new LC_Day_02_Longest_Common_Prefix();
        String[] testcase1={"flower","flow","flowInsight"};
        System.out.println("Common prefix to testcase1 :"+ lc_day_02_longest_common_prefix.longestCommonPrefix(testcase1));
        String[] testcase2={"dog","cat","bird"};
        System.out.println("Common prefix to testcase2 :"+ lc_day_02_longest_common_prefix.longestCommonPrefix(testcase2));
        String[] testcase3={"class","classes"};
        System.out.println("Common prefix to testcase3 :"+ lc_day_02_longest_common_prefix.longestCommonPrefix(testcase3));
    }
}
