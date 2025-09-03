package UNIT3;
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> Products = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Products.add(sc.nextInt());
        }
        System.out.println(Products);
        Collections.sort(Products);
        System.out.println(Products);
        if (Products.size() > 3) {
            System.out.println(Products.get(3));
        } else {
            System.out.println("Not enough elements to access index 3.");
        }
    }
}
