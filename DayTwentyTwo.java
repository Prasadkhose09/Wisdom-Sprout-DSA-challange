import java.util.HashMap;
public class DayTwentyTwo {
    static int firstElement_k_times(int arr[], int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
                
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
            
        }
        
        for(int i =0;i<arr.length;i++){
            if(map.get(arr[i]) == k ) return arr[i];
        }
        
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k=2;

        System.out.println(firstElement_k_times(arr, k));
    }
}
