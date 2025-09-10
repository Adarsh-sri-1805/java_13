package UNIT3;
import java.util.*;
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(12,10);
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add(3,"Fourth");
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v.get(2));
        System.out.println(v.remove(2));
        System.out.println(v);
    }
}
