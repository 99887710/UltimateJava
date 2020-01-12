package codewithjeff.lambda;

public class LambdaDemo {

    public static void print(String msg){
        System.out.println(msg);
    }

    public static void show(){
        greet(msg -> print(msg));
        greet(LambdaDemo::print);
    }

    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
