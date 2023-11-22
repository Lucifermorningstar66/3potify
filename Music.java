public class Music {
    public String musicName;
    public String artistName;
    public String albumName;
    public String musicTime;


    public Music(String musicName , String artistName , String albumName , String musicTime){
        this.musicName = musicName;
        this.artistName = artistName;
        this.albumName = albumName;
        this.musicTime = musicTime;
    }

    public String getMusicName () {
        return musicName;
    }

    public String getArtistName () {
        return artistName;
    }

    public String getAlbumName () {
        return albumName;
    }

    public String getMusicTime () {
        return musicTime;
    }

    public void setMusicName (String musicName) {
        this.musicName = musicName;
    }

    public void setArtistName (String artistName) {
        this.artistName = artistName;
    }

    public void setAlbumName (String albumName) {
        this.albumName = albumName;
    }

    public void setMusicTime (String musicTime) {
        this.musicTime = musicTime;
    }
}
