import java.util.*;

public class User {
    private String username;
    ArrayList<Playlist> playlist;

    public User(String username) {
        this.username = username;
        this.playlist = new ArrayList<Playlist>();
    }

    public String getUsername() {
        return username;
    }

    public void addPlaylist(Playlist a) {
        this.playlist.add(a);
    }

    public void removePlaylist(String name) {
        for (Playlist i : playlist) {
            if (i.getTitle().equals(name))
                playlist.remove(i);
        }
    }

    public boolean equals(Object o) {
        return ((User) o).username == username;
    }

    public ArrayList<Playlist> getAllPlayLists() {
        return playlist;
    }

    public Playlist getPlaylist(String a) {
        for (Playlist i : playlist) {
            if (i.getTitle().equals(a)) {
                return i;
            }
        }
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        for (Playlist i : playlist) {
            if (i.getTitle().equals(playlistTitle))
                friend.getAllPlayLists().add(i);
        }
    }
}

class SongLibrary {
    private static ArrayList<User> users = new ArrayList<User>();

    public SongLibrary() {
        users = new ArrayList<User>();
    }

    public static void addUser(User u) {
        users.add(u);
    }

    public static ArrayList<Playlist> getUserPlaylists(User u) {
        return u.getAllPlayLists();
    }
}
