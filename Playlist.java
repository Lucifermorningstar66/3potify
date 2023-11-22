public class Playlist {
    public String playlistName;
    public String listnerName;
    public String[] songsList;

    public Playlist (String playlistName, String listnerName, String[] songsList) {
        this.playlistName = playlistName;
        this.listnerName = listnerName;
        this.songsList = songsList;
    }

    public String getPlaylistName () {
        return playlistName;
    }

    public String getListnerName () {
        return listnerName;
    }

    public String[] getSongsList () {
        return songsList;
    }

    public void setPlaylistName (String playlistName) {
        this.playlistName = playlistName;
    }

    public void setListnerName (String listnerName) {
        this.listnerName = listnerName;
    }

    public void setSongsList (String[] songsList) {
        this.songsList = songsList;
    }
}
