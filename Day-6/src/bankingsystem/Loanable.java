package bankingsystem;

public interface Loanable {
    void applyForLoan(float amount);
    boolean calculateLoanEligibility(float amount);
}
