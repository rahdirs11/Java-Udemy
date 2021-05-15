import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("StormBringer", "Deep Purple");
        album.addSong("StormBringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady Double Dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of Fortune", 3.13);
        albums.add(album);

        album = new Album("For Those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I Put The Finger On You", 3.25);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject The Venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil Walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking The Rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy Man", playList);
        albums.get(0).addToPlayList(9, playList);

        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(4, playList);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("You got no songs in the playlist!");
            return;
        } else {
            if (listIterator.hasNext()) {
                System.out.println("Now playing -> " + listIterator.next().toString());
            } else {
                System.out.println("END OF PLAYLIST");
            }
        }
    }
}
