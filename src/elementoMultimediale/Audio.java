package elementoMultimediale;

public class Audio extends Elemento {
    private int volume;

    public Audio(String titolo, TipoElemento tipoElemento, int durata) {
        super(titolo, tipoElemento, durata);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {

            System.out.println("Il titolo della canzone che hai scelto è " + getTitolo());
        }

        ;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "volume=" + volume +
                '}';
    }
};
