package soundsystem;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

//    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
//    private CompactDisc compactDisc;

//    @Autowired
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }
//
//    public void play() {
//        compactDisc.play();
//    }

}
