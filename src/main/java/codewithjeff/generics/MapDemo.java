package codewithjeff.generics;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Customer> map = new HashMap<>();

        map.put("c1", new Customer("c1", "e1"));
        map.put("c2", new Customer("c2", "e2"));

        for (Customer c : map.values()) {
            System.out.println(c);
        }
    }
}
