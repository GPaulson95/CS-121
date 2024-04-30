package weekSeven.packageDemo;

public class Art {
    String piece;
    String artist;
    int rating;
    String location;

    public Art (String piece, String artist, int rating, String location){
        this.piece = piece;
        this.artist = artist;
        this.rating = rating;
        this.location = location;
    }
    public void printArt(){
        System.out.println(piece + artist + rating + location);
    }
}
