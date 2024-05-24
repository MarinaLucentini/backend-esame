package elementoMultimediale;

public class Audio extends Elemento implements Volume {
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
    public void abbassaVolume(int volume) {
        this.volume = volume--;

    }

    @Override
    public void alzaVolume(int volume) {
        this.volume = volume++;

    }

    @Override
    public void play() {

        String puntoEsclamativo = "!";
        for (int i = 0; i < getDurata(); i++) {
            System.out.println("Il titolo della canzone che hai scelto è " + getTitolo() + puntoEsclamativo.repeat(this.volume));
        }

    }

}
