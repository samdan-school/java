public class Tax {
    public static int SINGLE_FILER = 0;
    public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    Tax() {
        filingStatus = SINGLE_FILER;
        double[] year2009Rates = {10, 15, 25, 28, 33, 35};
        setRates(year2009Rates);
        int[][] year2009Brackets = {
                {0, 8351, 33951, 82251, 171551, 372951},
                {0, 16701, 67901, 137051, 208851, 372951},
                {0, 8351, 33951, 68526, 104426, 186476},
                {0, 11951, 45501, 117451, 190201, 372951}
        };
        setBrackets(year2009Brackets);
        taxableIncome = 0;
    }

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++) {
            for (int j = 0; j < brackets[i].length; j++)
                this.brackets[i][j] = brackets[i][j];
        }
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for (int i = 0; i < rates.length; i++)
            this.rates[i] = rates[i] / 100;
    }

    public double[] getRates() {
        return rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0, bracketTax = 0;
        double income = taxableIncome;
        for (int i = rates.length - 1; i >= 0; i--) {
            if (income >= brackets[filingStatus][i]) {
                bracketTax = income - brackets[filingStatus][i];
                tax += bracketTax * rates[i];
                income -= bracketTax;
            }
        }
        return tax;
    }

    public static void main(String args[]) {
        Tax year2009 = new Tax();
        System.out.println("Year 2009");
        printTax(year2009);
        System.out.println();


        double[] year2001Rates = {15, 27.5, 30.5, 35.5, 39.1};
        int[][] year2001Brackets = {
                {0,27051, 65551, 136751, 297351},
                {0,45201, 109251, 166501, 297351},
                {0,22601, 54625, 83251, 148676},
                {0,36251, 93651, 151651, 297351}
        };
        Tax year2001 = new Tax();
        year2001.setRates(year2001Rates);
        year2001.setBrackets(year2001Brackets);
        System.out.println("Year 2001");
        printTax(year2001);
    }

    public static void printTax(Tax tax) {
        System.out.printf("%6s%15s%15s%15s%15s\n", "Income", "Single", "Married", "Separate", "Head");
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%6d", i);
            tax.setTaxableIncome(i);
            for (int j = 0; j < 4; j++) {
                tax.setFilingStatus(j);
                System.out.printf("%15d", Math.round(tax.getTax()));
            }
            System.out.println();
        }
    }
}
