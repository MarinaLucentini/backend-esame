package elementoMultimediale;

public class Video extends Elemento implements Volume, Luminosità, Played {
    private int luminosità;

    public Video(String titolo, TipoElemento tipoElemento, int durata, int volume) {
        super(titolo, tipoElemento, durata, volume);
    }

    @Override
    public void play() {
        String puntoEsclamativo = "!";
        String asterisco = "*";
        for (int i = 0; i < getDurata(); i++) {
            System.out.println("Il titolo del video che hai scelto è " + getTitolo() + " volume: " + puntoEsclamativo.repeat(getVolume()) + " luminosità: " + asterisco.repeat(this.luminosità));
        }
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    @Override
    public void abbassaVolume(int volume) {
        setVolume(volume--);

    }

    @Override
    public void alzaVolume(int volume) {
        setVolume(volume++);
    }

    @Override
    public void aumentaLuminosità(int luminosità) {
        this.luminosità++;
    }

    @Override
    public void abbassaLuminosità(int luminosità) {
        this.luminosità--;
    }
}
