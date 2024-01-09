package java.imdb.imdb;

import java.util.List;


import java.util.ArrayList;

public class IMDB {

    private List<Filme> filmes;

    public IMDB() {
        this.filmes = new ArrayList<>();
        inicializarFilmes();
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    private void inicializarFilmes() {

    }

    public List<Filme> getFilmes() {
        return filmes;
    }
}
