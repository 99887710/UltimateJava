package codewithjeff.generics;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        GenericList<Integer> intList = new GenericList<>();
        GenericList<String> strList = new GenericList<>();

        intList.add(1);
        intList.add(3);

        strList.add("hello");
        strList.add("world");

        int r = intList.get(0);//        System.out.println(intList.get(1));
//        System.out.println(strList.get(0));


//        for (Integer integer : intList) {
//            System.out.println(integer);
//        }


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Jeff");
        arrayList.add("Amy");
        for (String s : arrayList) {
            System.out.println(s);
        }

        Collection<Integer> collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        Collection other = new ArrayList();

        other.addAll(collection);

        System.out.println(collection.equals(other));
    }
}
