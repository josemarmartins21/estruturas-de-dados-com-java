public class ListaLigada<TIPO> {
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    public void add(TIPO novoValor) {
        Elemento<TIPO> novoElemnto = new Elemento<TIPO>(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemnto;
            this.ultimo = novoElemnto;

        } else {
            this.ultimo.setProximo(novoElemnto);
            this.setUltimo(novoElemnto);
        }

        this.tamanho ++;

    }

    public Elemento<TIPO> pegar(int posicao) {
        Elemento<TIPO> atual = this.primeiro;

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }

    public void remover(TIPO valorProcurado) {
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;

        for (int i = 0; i < this.tamanho; i++) {
            if (atual.getValor().equals(valorProcurado)) {
                atual = anterior;
                atual = null;
                this.tamanho --;
                break;

            }

            anterior = atual;
            atual = atual.getProximo();
        }


    }

    public IteratorListaLigada<TIPO> getIterator() {
        return new IteratorListaLigada<TIPO>(this.primeiro);
    }
    
    public ListaLigada() {
        this.tamanho = 0;
    }

    
    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    
}
