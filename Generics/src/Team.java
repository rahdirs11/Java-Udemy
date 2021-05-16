import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (this.members.contains(player)) {
            System.out.println("Player is already on the team!");
            return false;
        }
        this.members.add(player);
        System.out.println(player.getName() + " has been added to " + this.name);
        return true;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(this.ranking(), team.ranking());
    }

    public int numberOfPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            ++won;
        } else if (ourScore == theirScore) {
            ++tied;
        } else {
            ++lost;
        }
        ++played;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {

        return won * 2 + tied;
    }
}
