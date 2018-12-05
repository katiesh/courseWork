package course3.payment;

import java.util.Date;

public class CreditCard {
    private Date expireDate;
    private long number;
    private int cvv;

    public CreditCard(Date expireDate, long number, int cvv) {
        this.expireDate = expireDate;
        this.number = number;
        this.cvv = cvv;
    }
}
