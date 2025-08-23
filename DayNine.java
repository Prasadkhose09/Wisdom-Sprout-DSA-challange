public class DayNine {
     public static String longestCommonPrefix(String[] strs) {
        int numberOfStrings = strs.length;
        
        for (int charIndex = 0; charIndex < strs[0].length(); charIndex++) {
            for (int strIndex = 1; strIndex < numberOfStrings; strIndex++) {
                if (strs[strIndex].length() <= charIndex || strs[strIndex].charAt(charIndex) != strs[0].charAt(charIndex)) {
                    return strs[0].substring(0, charIndex);
                }
            }
        }
        
        return strs[0];
    }

    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
    
}
