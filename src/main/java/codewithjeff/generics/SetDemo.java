package codewithjeff.generics;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "c", "e"));
        Set<String> set2 = new HashSet<>(Arrays.asList("f", "c", "e"));

        set1.removeAll(set2);
        System.out.println(set1);

    }
}
