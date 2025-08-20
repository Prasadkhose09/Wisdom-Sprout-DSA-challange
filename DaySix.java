import java.util.*;
public class DaySix {



    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) res.add(new int[]{0, i});
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) res.add(new int[]{start + 1, i});
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> sub = findZeroSumSubarrays(arr);
        for (int[] s : sub) System.out.println(Arrays.toString(s));
    }
}

    

