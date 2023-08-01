import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        int i = 0;
        for (String s : this.tasks) {
            System.out.println((i+1) + ": " + s );
            i++;
        }
    }

    public void remove(int num) {
        this.tasks.remove(num-1);
    }
}
