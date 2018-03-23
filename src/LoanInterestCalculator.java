public class LoanInterestCalculator {
    public static void main(String[] args) {
        final double LOANS = 6000;
        final double INTEREST_RATE = 0.075;
        final double MONTHS = 60;
        double range;

        double capital = LOANS / MONTHS;
        System.out.println("Principal pay in " + MONTHS + " months: " + capital);

        range = 0;
        double first_year_interest = calculateInterest(LOANS, INTEREST_RATE, range);
        System.out.println("First year interest: " + first_year_interest);

        range = 0.035;
        double next_year_interest = calculateInterest(LOANS, INTEREST_RATE, range);
        System.out.println("Next year interest: " + next_year_interest);

        System.out.println("Monthly amount paid in the first year: " + (capital + first_year_interest));
        System.out.println("Monthly amount paid in the next year: " + (capital + next_year_interest));
    }

    public static double calculateInterest(double loans, double interest_rate, double range) {
        return loans * ((interest_rate + range) / 12);
    }
}