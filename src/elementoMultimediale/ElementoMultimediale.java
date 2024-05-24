package elementoMultimediale;

public abstract class ElementoMultimediale {
    private String titolo;
    private TipoElemento tipoElemento;

    public ElementoMultimediale(String titolo, TipoElemento tipoElemento) {
        this.titolo = titolo;
        this.tipoElemento = tipoElemento;

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public TipoElemento getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoElemento tipoElemento) {
        this.tipoElemento = tipoElemento;
    }
}
