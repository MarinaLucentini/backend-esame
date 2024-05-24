package elementoMultimediale;

public class Immagine extends ElementoMultimediale implements Luminosità {
    private int luminosità;

    public Immagine(String titolo, TipoElemento tipoElemento) {
        super(titolo, tipoElemento);
    }

    @Override
    public void aumentaLuminosità(int luminosità) {
        this.luminosità++;
    }

    @Override
    public void abbassaLuminosità(int luminosità) {
        this.luminosità--;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public void show() {
        String asterisco = "*";
        System.out.println("L'immagine che hai scelto è " + getTitolo() + " luminisità: " + asterisco.repeat(this.luminosità));
    }
}
