package UNIT3;
import java.util.*;
public class treeset1 {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<>();
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            ts.add(sc.nextInt());
            n--;
        }
        System.out.println(ts);
    }
}
