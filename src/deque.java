import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("First");
        dq.addFirst("Second");
        dq.addLast("Third");
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
