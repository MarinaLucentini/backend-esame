import elementoMultimediale.Audio;
import elementoMultimediale.TipoElemento;
import elementoMultimediale.Video;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio("Mal di testa", TipoElemento.AUDIO, 5, 2);
        audio.setVolume(5);
        audio.play();
        Video video = new Video("Voglio morire", TipoElemento.VIDEO, 2, 5);
        video.setLuminosità(4);
        video.play();


    }
}