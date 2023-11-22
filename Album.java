import java.util.ArrayList;

public class Album {
    public String albumName;
    public String albumArtistName;
    public ArrayList<Music> musicList = new ArrayList<>();

    public Album (String albumName, String albumArtistName, ArrayList<Music> musicList) {
        this.albumName = albumName;
        this.albumArtistName = albumArtistName;
        this.musicList = musicList;
    }

    public String getAlbumName () {
        return albumName;
    }

    public String getAlbumArtistName () {
        return albumArtistName;
    }

    public ArrayList<Music> getMusicList () {
        return musicList;
    }

    public void setAlbumName (String albumName) {
        this.albumName = albumName;
    }

    public void setAlbumArtistName (String albumArtistName) {
        this.albumArtistName = albumArtistName;
    }

    public void setMusicList (ArrayList<Music> musicList) {
        this.musicList = musicList;
    }
}
