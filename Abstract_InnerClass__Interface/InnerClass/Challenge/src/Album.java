import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (this.songs.findSong(title) == -1) {
            this.songs.addSong(new Song(title, duration));
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
        return this.songs.getSongs();
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
        int index = this.songs.findSong(title);
        if (index != -1) {
            playList.add(getSongs().get(index));
            return true;
        }
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public ArrayList<Song> getSongs() {
            return this.songs;
        }

        public boolean addSong(Song song) {
            if (this.songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private int findSong(String title) {
            for (Song s: getSongs()) {
                if (s.getTitle().equals(title)) {
                    return 1;
                }
            }
            return -1;
        }
    }
}
