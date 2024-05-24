package elementoMultimediale;

public abstract class Elemento extends ElementoMultimediale {
    private int durata;
    private int volume;

    public Elemento(String titolo, TipoElemento tipoElemento, int durata, int volume) {
        super(titolo, tipoElemento);
        this.durata = durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
