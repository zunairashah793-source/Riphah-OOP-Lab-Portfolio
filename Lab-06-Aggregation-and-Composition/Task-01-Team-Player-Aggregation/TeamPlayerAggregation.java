import java.util.ArrayList;
import java.util.List;

class Player {
    private int jerseyNo;
    private String name;

    public Player(int jerseyNo, String name) {
        this.jerseyNo = jerseyNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Jersey " + jerseyNo + " - " + name);
    }
}

class Team {
    private String teamName;
    private List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (player != null) players.add(player);
    }

    public void displayPlayers() {
        System.out.println(teamName + " players:");
        for (Player player : players) player.display();
    }
}

public class TeamPlayerAggregation {
    public static void main(String[] args) {
        // Players are created outside the Team, so they can exist independently.
        Player player1 = new Player(7, "Ali");
        Player player2 = new Player(10, "Sara");
        Player player3 = new Player(9, "Ahmed");

        Team team = new Team("Riphah Tigers");
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);
        team.displayPlayers();

        // Removing the Team reference does not remove the Player references.
        team = null;
        System.out.println("\nPlayers still exist after the Team reference is removed:");
        player1.display();
        player2.display();
        player3.display();
    }
}
