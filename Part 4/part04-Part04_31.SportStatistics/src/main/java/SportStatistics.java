
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String res = scanner.nextLine();
                String[] contents = res.split(",");

                for (int i = 0; i < 2 ; i++) {
                    boolean isNew = true;
                    for (Team team : teams) {
                        if (team.getName().equals(contents[i])) {
                            team.addGame();
                            if (i == 0 ){
                                if (Integer.valueOf(contents[2]) > Integer.valueOf(contents[3])) {
                                    team.addWin();
                                }
                                else {
                                    team.addLose();
                                }
                            } else {
                                if (Integer.valueOf(contents[2]) > Integer.valueOf(contents[3])) {
                                    team.addLose();
                                }
                                else {
                                    team.addWin();
                                }

                            }
                            isNew = false;
                        }
                    }

                    if (isNew){
                        Team newTeam = new Team(contents[i]);
                        if (i == 0 ){
                            if (Integer.valueOf(contents[2]) > Integer.valueOf(contents[3])) {
                                newTeam.addWin();
                            }
                            else {
                                newTeam.addLose();
                            }
                        } else {
                            if (Integer.valueOf(contents[2]) > Integer.valueOf(contents[3])) {
                                newTeam.addLose();
                            }
                            else {
                                newTeam.addWin();
                            }

                        }
                        teams.add(newTeam);
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("Team:");
        String name = scan.nextLine();
        boolean found = false;
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                found = true;
                System.out.println("Games: " + team.getGame());
                System.out.println("Wins: " + team.getWin());
                System.out.println("Losses: " + team.getLose());
                break;
            } 
        }
        if (!found) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");

        }

    }

}
