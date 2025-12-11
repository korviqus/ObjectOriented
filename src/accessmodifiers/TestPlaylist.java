package accessmodifiers;

public class TestPlaylist {
    public static void main(String[] args) {
        Playlist vocaloidSongs = new Playlist("Vocaloid songs");
        vocaloidSongs.addSong("Mesmeriser");
        vocaloidSongs.addSong("Override");
        vocaloidSongs.addSong("Monitoring");
        vocaloidSongs.printSongs();

    }

}
