
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

    public Money plus(Money add) {
        Money newMoney = new Money(this.euros + add.euros, this.cents + add.cents);

        return newMoney;
    }

    public boolean lessThan(Money compare) {
        if (this.euros < compare.euros) {
            return true;
        } else if (this.euros == compare.euros && this.cents < compare.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decrease) {
        int cent = this.cents - decrease.cents;
        int euro = this.euros - decrease.euros;
        if (euro <0) {
            cent = 0;
            euro = 0;
        } else if (cent < 0) {
            euro--;
            cent+=100;
        }

        Money newMoney = new Money(euro, cent);

        return newMoney;
    }

}
