public class Counter {
    private int value;

    public Counter(int val) {
        this.value = val;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase(int val) {
        if (val > 0)
            this.value += val;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int val) {
        if (val > 0)
            this.value -= val;
    }

    public void decrease() {
        this.decrease(1);
    }
    
}
