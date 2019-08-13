package lab_03_04.lab_03_04_06;

public class VideoPlayer extends Player implements Technic{
    public String quality;
    public VideoPlayer() {
        super();
    }
    public VideoPlayer(int volume,String quality) {
        super(volume);
        this.quality=quality;
    }
    public void show() {
        System.out.println("Громкость: "+volume+", качество: "+quality);
    }

}