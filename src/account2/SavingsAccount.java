package account2;

@SuppressWarnings("ALL")
public class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double rate() {
        return 0;
    }
}
