import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (this.league.contains(team)) {
            return false;
        }

        this.league.add(team);
        return true;
    }

    public void showLeaugeTable() {
        Collections.sort(this.league);
        for (T t: this.league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
