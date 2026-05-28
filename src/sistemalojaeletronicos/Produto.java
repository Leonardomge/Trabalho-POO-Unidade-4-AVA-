package sistemalojaeletronicos;

public abstract class Produto
{
    private String marca;
    private String modelo;
    private double preco;

    public Produto(String marca, String modelo, double preco)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco)
    {
        if (preco < 0) throw new IllegalArgumentException("Preço não pode ser negativo.");
        this.preco = preco;
    }

    public abstract String getDetalhes();

    @Override
    public String toString()
    {
        return String.format("[%s] %s %s - R$ %.2f",
                getClass().getSimpleName(), marca, modelo, preco);
    }
}
