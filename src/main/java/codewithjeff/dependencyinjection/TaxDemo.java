package codewithjeff.dependencyinjection;

public class TaxDemo {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(new TaxRule2020());
        System.out.println(calculator.getTotalIncomeTax(100));

    }
}
