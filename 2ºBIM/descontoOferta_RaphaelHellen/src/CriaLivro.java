import br.com.etechoracio.livraria.enums.tipoCapaEnum;
import br.com.etechoracio.livraria.model.*;

public class CriaLivro {

    public static void main(String[] args) {

        Editora editora = new Editora();

        editora.setNome("Moderna");
        editora.setSite("moderna.com.br");

        Livro primeiroLivro = new LivroImpresso();

        primeiroLivro.setTitulo("LivroImpresso");
        primeiroLivro.setResumo("aa");
        primeiroLivro.setValor(100);
        primeiroLivro.setAutor("Homero");
        primeiroLivro.setTipoCapa(tipoCapaEnum.PERSONALIZADA);
        primeiroLivro.setEditora(editora);
        primeiroLivro.setPaginas(109);

        primeiroLivro.exibirLivro();

        Kindle segundoLivro = new Kindle();

        segundoLivro.setTitulo("Kindle");
        segundoLivro.setResumo("aa");
        segundoLivro.setValor(100);
        segundoLivro.setAutor("Homero");
        segundoLivro.setTipoCapa(tipoCapaEnum.PERSONALIZADA);
        segundoLivro.setEditora(editora);
        segundoLivro.setPaginas(109);
        segundoLivro.setMarcaDAgua("HAS");
        segundoLivro.aplicarDesconto(0.3);

        segundoLivro.exibirLivro();

        SacolaCompras sacola2304 = new SacolaCompras();
        sacola2304.adicionar(primeiroLivro);
        sacola2304.adicionar(segundoLivro);

        Revista primeirarevista = new Revista();

        primeirarevista.setTitulo("Revista1");
        primeirarevista.setValor(15.99);

        sacola2304.adicionar(primeirarevista);

        LivroCortesia livroCortesia = new LivroCortesia("TesteMarcaDagua");
        sacola2304.adicionar(livroCortesia);
    }
}
