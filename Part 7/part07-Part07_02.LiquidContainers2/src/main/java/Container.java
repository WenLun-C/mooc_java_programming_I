public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amt) {
        if (amt > 0)
            this.amount += amt;
        this.amount = (this.amount > 100) ? 100 : this.amount;
    }
    
    public void remove(int amt) {
        if (amt > 0) 
            this.amount-=amt;
        this.amount = (this.amount <0) ? 0:this.amount;
    }

    public String toString() {
        return this.amount+"/100";
    }
    
}
