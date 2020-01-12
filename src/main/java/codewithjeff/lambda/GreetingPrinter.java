package codewithjeff.lambda;

public class GreetingPrinter implements Printer{

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
