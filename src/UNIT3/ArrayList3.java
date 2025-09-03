package UNIT3;
import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of the product");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            products.add(sc.next());
        }
        Iterator itr = products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(products);
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());
        System.out.println(products.get(2));
        products.addLast("Papaya");
        products.addFirst("Pineapple");
        System.out.println(products);
    }
}
