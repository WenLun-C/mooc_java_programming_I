import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stacks.isEmpty();
    }

    public void add(String val) {
        this.stacks.add(val);
    }

    public ArrayList<String> values() {
        return this.stacks;
    }

    public String take(){
        String last = this.stacks.get(this.stacks.size() -1);
        this.stacks.remove(last);
        return last;
    }
    
}
