package codewithjeff.dependencyinjection;

public class TaxRule2019 implements TaxRule {
    @Override
    public int calculateXax(int totalIncome) {
        return totalIncome * 2;
    }
}
