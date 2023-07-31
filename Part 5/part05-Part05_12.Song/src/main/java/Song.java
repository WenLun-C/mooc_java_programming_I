
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object song) {
        if (this == song) {
            return true;
        }

        if (!(song instanceof Song)) {
            return false;
        }

        Song newSong = (Song) song;

        if (newSong.name == this.name &&
        newSong.artist == this.artist &&
        newSong.durationInSeconds == this.durationInSeconds) {
            return true;
        }

        else {
            return false;   
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
