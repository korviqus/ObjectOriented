package accessmodifiers;
import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<String> songs;

    public Playlist(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addSong(String songName){
        songs.add(songName);
    }

    public void removeSong(String name){
        songs.remove(name);
    }

    public void printSongs(){
        System.out.println("Playlist: "+name);
        if(songs.isEmpty()){
            System.out.println("No songs in the playlist.");
        }
        for(int i = 0; i < songs.size(); i++){
            System.out.println((i+1) + ". "+songs.get(i));
        }
    }

}
