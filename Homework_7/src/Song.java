public class Song implements Comparable {
    private String songName, artistName, duration;
    public Song(){};
    public Song(String songName, String artistName, String duration){
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }
    public String getSongName() {
        return songName;
    }
    public String getArtistName() {
        return artistName;
    }
    public String getDuration(){
        return duration;
    }
    public boolean equals(Object o){
        if (o instanceof Song)
            return ((Song)o).songName == songName 
            && ((Song)o).artistName == artistName
            && ((Song)o).duration == duration;
        return false;
    }
    @Override
    public int compareTo(Object o) {
        Song s = (Song)o;
        if (s.getSongName().compareTo(songName) > 0){
            return -1;
        }
        else if (s.getSongName().compareTo(songName) < 0){
            return 1;
        }
        if (s.getSongName().compareTo(songName) == 0){
            if (s.getArtistName().compareTo(artistName) > 0)
                return -1;
            else if (s.getArtistName().compareTo(artistName) < 0)
                return 1;
        }
        return 0;
    }
    public String toString(){
        return songName + " by " + artistName + " (" + duration + ")";
    }
    
}

