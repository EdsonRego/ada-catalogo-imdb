package java.imdb.operacoesfilme;

import java.imdb.ator.Ator;
import java.imdb.diretor.Diretor;
import java.imdb.filme.Filme;
import java.util.Arrays;
public class OperacoesFilme {

    public void associarAtoresEDiretorFilme(Filme filme, Diretor diretor, Ator... atores) {
        if (filme != null && diretor != null) {
            filme.setDiretor(diretor);
            filme.setAtores(Arrays.asList(atores));

            System.out.println("Associação realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a associação. Verifique se o filme ou diretor existem.");
        }
    }
}
