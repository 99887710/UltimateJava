package codewithjeff.dependencyinjection;

public class TaxCalculator {

    private TaxRule taxRule;

    public TaxCalculator(TaxRule taxRule) {
        this.taxRule = taxRule;
    }

    public int getTotalIncomeTax(int totalIncome) {
        return taxRule.calculateXax(totalIncome);
    }
}
