package codewithjeff.dependencyinjection;

public class TaxRule2020 implements TaxRule {
    @Override
    public int calculateXax(int totalIncome) {
        return totalIncome * 3;
    }
}
