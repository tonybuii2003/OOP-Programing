import java.util.*;

public class Playlist {
    private String name;
    ArrayList<Song> songs;
    public Playlist(String name){
        this.name = name;
        this.songs =  new ArrayList<Song>();
    }
    public String getTitle(){
        return name;
    }
    public void setTitle(String a) {
        this.name = a;
    }
    public ArrayList<Song> getSongsList(){
        return songs;
    }
    public void addSong(Song a){
        songs.add(a);
    }
    public void removeSong(String name){
        Song s = new Song();
        for (Song i: songs){
            if (i.getSongName().equals(name))
                s = i;
        }
        songs.remove(s);
    }
    public boolean equals(Object o){
        return ((Playlist)o).name == name;
    }
    public void swapSongs(Song song1, Song song2){
        int firstIndex = 0, secondIndex = 0;
        if (songs.contains(song1) && songs.contains(song2)){
            for (int i = 0; i<songs.size(); i++) {
                if (songs.get(i).equals(song1)){
                    firstIndex = i;
                }
                if (songs.get(i).equals(song2)) {
                    secondIndex = i;
                }
            }
            Song temp = songs.get(firstIndex);
            songs.set(firstIndex, songs.get(secondIndex));
            songs.set(secondIndex,temp);
        }
    }
    public String getTotalTime(){
        int totalMinutes=0, totalSeconds=0;
        String min,sec;
        
        for (Song i:songs){
            min = "";
            sec = "";
            min = i.getDuration().substring(0,i.getDuration().indexOf(":"));
            sec = i.getDuration().substring(i.getDuration().indexOf(":")+1);
            totalMinutes=totalMinutes + Integer.parseInt(min);
            totalSeconds=totalSeconds + Integer.parseInt(sec);
        }
        if (totalSeconds > 60){
            totalMinutes += totalSeconds/60;
            totalSeconds = totalSeconds%60;
        }
        return totalMinutes + " min, " + totalSeconds + " sec";
    }
    public void sortSongs(){
        int n = songs.size();
        Song temp;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (songs.get(j).compareTo(songs.get(j+1)) == 1) {
                    swapSongs(songs.get(j), songs.get(j+1));
                }
    }
    public String toString(){
        String str = name + " - " + getTotalTime();
        for (int i=0; i < songs.size(); i++){
            str += "\n" + (i+1) + ". " + songs.get(i).toString();
        }
        return str;
    }

}
