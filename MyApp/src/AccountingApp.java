public class AccountingApp {
    public static void main(gString[] args) {
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = vat + valueOfSupply;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        double[] dividendRates;

        if(income > 10000.0) {
            dividendRates = new double[] {0.5, 0.3, 0.2};
        } else {
            dividendRates = new double[] {1.0, 0, 0};
        }

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : " + income);

        int i = 0;
        while (i < dividendRates.length) {
            System.out.println("Dividend "+(i+1)+": "+ income * dividendRates[i]);
            i++;
        }
    }
}
