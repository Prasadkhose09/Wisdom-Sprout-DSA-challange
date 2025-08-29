    import java.util.*;

    public class DayFifteen {

    static public int LongestSubstring(String s) {
        
        ArrayList<Character> list = new ArrayList<>();
        int max =  0;
        int start =0;

        for(int i=0;i<s.length();i++){
               while (list.contains(s.charAt(i))) {
                list.remove(0);
            }
            
                list.add(s.charAt(i));
                max = Math.max(max, list.size());
            
        }
    
        
        return max;
    }

    public static void main(String args[]){
        String s= "abcabcbb";
        System.out.println(LongestSubstring(s));


    }
}
    

