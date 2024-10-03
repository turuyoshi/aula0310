public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Livro livro1 = new Livro("Java para Iniciantes", "Arthur", "12345", 10);
        Livro livro2 = new Livro("Estruturas de Dados", "Senha Pix", "67890", 5);

        estoque.adicionarLivro(livro1);
        estoque.adicionarLivro(livro2);

        estoque.listarLivros();

        estoque.atualizarQuantidade("12345", 15);
        estoque.listarLivros();

        estoque.removerLivro("67890");
        estoque.listarLivros();
    }
}