package design_patten.structural.adpter;

public class Adapter implements MediaPlayer{
    private AdvancedPlayer advancedPlayer;

    public Adapter(AdvancedPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }
    @Override
    public void play(String fileName) {
        advancedPlayer.playMp4(fileName);
    }
}
