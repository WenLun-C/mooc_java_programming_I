
public class Statistics {
    private int count;
    private int total = 0;

    public void addNumber(int num) {
        this.count ++;
        this.total += num;
    }

    public int getCount() {
        return this.count;
    }

    public int sum(){
        return this.total;
    }

    public double average() {
        if (this.count > 0) {
            return (sum() * 1.0 / getCount());
        } else {
            return 0;
        }
    }
}
