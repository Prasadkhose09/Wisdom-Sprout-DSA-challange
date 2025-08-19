import java.util.ArrayList;
import java.util.Collections;

import java.util.*;
public class DayFive {

     static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n= arr.length;
        list.add(arr[n-1]);
        int mx= arr[n-1];
        for(int i= n-2;i>=0;i-- ){
            if(arr[i]>=mx){
                list.add(arr[i]);
            }
            mx = Math.max(mx, arr[i]);
            
            
        }
        Collections.reverse(list);
        return list;
    }
    

   public static void main(String[] args) {
        int[] arr ={16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));

   }
}
