package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

  private String title;
  private String artist;
  private List<String> tracks;

//  public BlankDisc(String title, String artist, List<String> tracks) {
//    this.title = title;
//    this.artist = artist;
//    this.tracks = tracks;
//  }

  @Override
  public void playTrack(int TrackNumber) {
    System.out.println("Playing " + title + " by " + artist);
    System.out.println("-Track: " + tracks.get(TrackNumber));
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public List<String> getTracks() {
    return tracks;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setTracks(List<String> tracks) {
    this.tracks = tracks;
  }

}
