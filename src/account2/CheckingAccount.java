package account2;

@SuppressWarnings("ALL")
public class CheckingAccount extends Account {

    private double rate;

    CheckingAccount(double rate) {
        super(0);
        this.rate = rate;
    }

    @Override
    double rate() {
        return rate;
    }
}
