package elementoMultimediale;

public abstract class Elemento extends ElementoMultimediale {
    private int durata;

    public Elemento(String titolo, TipoElemento tipoElemento, int durata) {
        super(titolo, tipoElemento);
        this.durata = durata;
    }

    public abstract void play();

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
