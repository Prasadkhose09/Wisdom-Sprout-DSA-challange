import java.util.*;

public class DayEleven {
    public static List<String> stringPermutations(String s) {
        List<String> result = new ArrayList<>();
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        backtrack(chars, new boolean[chars.length], new StringBuilder(), result);




        return result;


    }

   

    public static void main(String[] args) {
        System.out.println(stringPermutations("abc"));
    }

     private static void backtrack(char[] chars, boolean[] used, StringBuilder path, List<String> result) {
        if (path.length() == chars.length) {
            result.add(path.toString());

            
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) continue;
            used[i] = true;
            path.append(chars[i]);
            backtrack(chars, used, path, result);


            path.deleteCharAt(path.length() - 1);

            used[i] = false;
        }
    }
}
