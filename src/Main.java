import elementoMultimediale.Audio;
import elementoMultimediale.TipoElemento;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio("Mal di testa", TipoElemento.AUDIO, 5);
        audio.setVolume(2);
        audio.play();


    }
}