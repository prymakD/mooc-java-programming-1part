
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int totalAmountCents = this.cents + addition.cents;
        int totalAmountEuros = this.euros + addition.euros;

        if (cents > 99) {
            totalAmountEuros += totalAmountCents / 100;
            totalAmountCents %= 100;
        }

        Money newMoney = new Money(totalAmountEuros, totalAmountCents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }

        if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int totalAmountEuros = this.euros - decreaser.euros;
        int totalAmountCents = this.cents - decreaser.cents;
        
        if (totalAmountEuros >= 0){
            if (totalAmountCents < 0){
                totalAmountEuros = totalAmountEuros - 1;
                totalAmountCents = totalAmountCents + 100;
            }
        } else {
            totalAmountEuros = 0;
            totalAmountCents = 0;
        }
            Money newMoney = new Money(totalAmountEuros, totalAmountCents); // create a new Money object that has the correct worth
            return newMoney;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
