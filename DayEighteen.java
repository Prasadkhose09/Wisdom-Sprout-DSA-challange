 import java.util.*;

class DayEighteen {


    public static int countDivisors(int n) {
        int count = 0;


        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;

                if (i != n / i) count++;


            }
        }



        return count;
    }



    public static void main(String[] args) {
        int N = 12;


        System.out.println(countDivisors(N));
    }
}

