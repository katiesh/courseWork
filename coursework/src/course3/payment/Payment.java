package course3.payment;

public class Payment {
    private boolean wayForPay;
    private boolean typeOfPayment;
    private CreditCard creditCard;
    private float percentOfPayment;
    private float specialOffer;

    public Payment(boolean wayForPay) {
        this.wayForPay = wayForPay;
    }

    public Payment() {
    }

    public boolean isWayForPay() {
        return wayForPay;
    }

    public void setWayForPay(boolean wayForPay) {
        this.wayForPay = wayForPay;
    }

    public boolean isTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(boolean typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public float getPercentOfPayment() {
        return percentOfPayment;
    }

    public void setPercentOfPayment(float percentOfPayment) {
        this.percentOfPayment = percentOfPayment;
    }

    public float getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(float specialOffer) {
        this.specialOffer = specialOffer;
    }
}
