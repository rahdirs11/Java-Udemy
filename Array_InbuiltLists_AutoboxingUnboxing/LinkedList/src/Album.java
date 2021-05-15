import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    private int findSong(String title) {
        for (Song s: getSongs()) {
            if (s.getTitle().equals(title)) {
                return 1;
            }
        }
        return -1;
    }

    public boolean addSong(String title, int duration) {
        if (findSong(title) == -1) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getNumberOfSongs() {
        return getSongs().size();
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index < getNumberOfSongs()) {
            playList.add(getSongs().get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        int index = findSong(title);
        if (index != -1) {
            playList.add(getSongs().get(index));
            return true;
        }
        return false;
    }
}
