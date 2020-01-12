package codewithjeff.lambda;

public class Demo {

    public static void main(String[] args) {
        Printer printer = new GreetingPrinter();
        printer.print("hi guys");
        printer.print();

        new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        }.print("this is anonymous class");

        new Runnable(){
            @Override
            public void run() {

            }
        }.run();


        LambdaDemo.show();
    }


}
