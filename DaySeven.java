public class DaySeven {
    public static int trap(int[] heigth) {
        int n = heigth.length;

        
        int leftmax[] = new int[heigth.length];
        leftmax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heigth[i], leftmax[i - 1]);
        }

        
        int rightmax[] = new int[n];
        rightmax[n - 1] = heigth[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(heigth[i], rightmax[i + 1]);
        }

        
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            trapwater = trapwater + waterLevel - heigth[i];

        }
        return trapwater;

        
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    
}
