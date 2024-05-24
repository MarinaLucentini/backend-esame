package elementoMultimediale;

public class Audio extends Elemento implements Volume {


    public Audio(String titolo, TipoElemento tipoElemento, int durata, int volume) {
        super(titolo, tipoElemento, durata, volume);
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
    public void play() {

        String puntoEsclamativo = "!";
        for (int i = 0; i < getDurata(); i++) {
            System.out.println("Il titolo della canzone che hai scelto è " + getTitolo() + " volume: " + puntoEsclamativo.repeat(getVolume()));
        }

    }

}
