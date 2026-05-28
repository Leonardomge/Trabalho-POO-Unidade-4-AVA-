package sistemalojaeletronicos;

public class Cliente
{
    private String nome;
    private String cpf;
    private String email;
    private final CarrinhoDeCompras carrinho;

    public Cliente(String nome, String cpf, String email)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carrinho = new CarrinhoDeCompras();
    }

    public void adicionarAoCarrinho(Produto produto, int quantidade) {
        carrinho.adicionarProduto(produto, quantidade);
    }

    public void removerDoCarrinho(Produto produto) {
        carrinho.removerProduto(produto);
    }

    public void exibirCarrinho()
    {
        System.out.printf("%n Carrinho de %s %n", nome);
        carrinho.exibirCarrinho();
    }

    public double calcularTotal() {
        return carrinho.calcularTotal();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public CarrinhoDeCompras getCarrinho() { return carrinho; }

    @Override
    public String toString() {
        return String.format("Cliente: %-20s | CPF: %s | Email: %s", nome, cpf, email);
    }
}
