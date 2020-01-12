package codewithjeff.generics;

public class Utils {

    public static <T extends Comparable> T max(T first, T second){
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V> void printKeyPair(K key, V val) {
        System.out.println("K="+ key + ", V=" + val);
    }

    public static void print(GenericList<?> list){

    }
}
