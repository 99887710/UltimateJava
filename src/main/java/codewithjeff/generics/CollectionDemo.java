package codewithjeff.generics;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        collection.add(1);
        collection.add(2);
        System.out.println(collection);
    }
}
