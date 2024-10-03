public class Estoque {
    private Livro[] livros;
    private int contador;

    public Estoque() {
        livros = new Livro[100]; // Vetor com capacidade para 100 livros
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getIsbn().equals(livro.getIsbn())) {
                livros[i].setQuantidade(livros[i].getQuantidade() + livro.getQuantidade());
                return; // Se o livro já existe, apenas atualiza a quantidade
            }
        }
        if (contador < livros.length) {
            livros[contador++] = livro; // Adiciona um novo livro
        } else {
            System.out.println("Estoque cheio!");
        }
    }

    public void removerLivro(String isbn) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                livros[i] = livros[contador - 1]; // Substitui pelo último livro
                livros[contador - 1] = null;
                contador--;
                System.out.println("Livro removido.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public Livro buscarLivro(String isbn) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                return livros[i];
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void listarLivros() {
        if (contador == 0) {
            System.out.println("Nenhum livro em estoque.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(livros[i].toString());
        }
    }

    public void atualizarQuantidade(String isbn, int quantidade) {
        Livro livro = buscarLivro(isbn);
        if (livro != null) {
            livro.setQuantidade(quantidade);
            System.out.println("Quantidade atualizada.");
        }
    }
}

