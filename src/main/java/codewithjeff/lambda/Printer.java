package codewithjeff.lambda;

public interface Printer {

    void print(String msg);

    default void print(){
        System.out.println("Hellow world");
    }
}
