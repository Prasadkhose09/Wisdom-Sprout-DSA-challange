    import java.util.*;

public class DaySeventeen {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        ArrayList<Long> factors = new ArrayList<>();

        while (n % 2 == 0) {
            factors.add(2L);
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) factors.add(n);

        StringBuilder sb = new StringBuilder();

        sb.append('[');

        for (int i = 0; i < factors.size(); i++) {
            sb.append(factors.get(i));
            if (i < factors.size() - 1) sb.append(", ");
        }


        sb.append(']');

        System.out.println(sb.toString());
    }
}


