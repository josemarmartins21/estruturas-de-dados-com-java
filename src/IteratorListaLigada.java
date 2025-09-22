public class IteratorListaLigada<TIPO> {
   private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO> atual) {
        this.elemento = atual;
    }

    public boolean temProximo() {
        if (this.elemento.getProximo() != null) {
            return true;

        } else {
            return false;
        }

    }

    public Elemento<TIPO> getProximo() {
        elemento = this.elemento.getProximo();

        return elemento;
    }

    public Elemento<TIPO> getElemento() {
        return elemento;
    }

    public void setElemento(Elemento<TIPO> elemento) {
        this.elemento = elemento;
    }

    

}
