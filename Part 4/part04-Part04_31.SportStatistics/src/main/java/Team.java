public class Team {
    private String name;
    private int game;
    private int win;
    private int lose;

    public Team(String name) {
        this.name = name;
        this.game = 1;
        this.win = 0;
        this.lose = 0;
    }

    public void addGame() {
        this.game++;
    }

    public void addWin() {
        this.win++;
    }

    public void addLose() {
        this.lose++;
    }

    public int getGame() {
        return this.game;
    }

    public String getName() {
        return this.name;
    }

    public int getWin() {
        return this.win;
    }

    public int getLose() {
        return this.lose;
    }
    
}
