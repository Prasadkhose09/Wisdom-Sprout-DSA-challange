import java.util.Scanner;

public class DaySecond {

    public static int findMissing(int[] arr){
        int n = arr.length;

        int arrSum = 0;

        for(int i=0;i<n;i++){
            arrSum +=arr[i];

        }
        int exp = (n*(n+1))/2;
        return exp- arrSum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMissing(arr));
    }
    
}
