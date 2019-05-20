import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {
    @Test
    public void initTest() {
        Account account = new Account();
        account.getBalance();
        assertThat(account.getBalance(), is(0));
    }

    @Test
    public void depositTest() {
        Account account = new Account();
        account.deposit(500);
        assertThat(account.getBalance(), is(500));
    }

    @Test
    public void withdrawTest() {
        Account account = new Account();
        account.deposit(3000);
        assertThat(account.getBalance(), is(3000));
        account.withdraw(1200);
        assertThat(account.getBalance(), is(1800));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cantWithdrawTest() {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(5000);
    }
}

