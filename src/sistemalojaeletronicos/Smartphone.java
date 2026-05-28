package sistemalojaeletronicos;

public class Smartphone extends Produto
{
    private double tamanhoTela;
    private int capacidadeArmazenamento;
    private int cameraMegapixels;

    public Smartphone(String marca, String modelo, double preco, double tamanhoTela, int capacidadeArmazenamento, int cameraMegapixels)
    {
        super(marca, modelo, preco);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.cameraMegapixels = cameraMegapixels;
    }

    public double getTamanhoTela() { return tamanhoTela; }
    public void setTamanhoTela(double tamanhoTela) { this.tamanhoTela = tamanhoTela; }

    public int getCapacidadeArmazenamento() { return capacidadeArmazenamento; }
    public void setCapacidadeArmazenamento(int capacidadeArmazenamento)
    {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getCameraMegapixels() { return cameraMegapixels; }
    public void setCameraMegapixels(int cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    @Override
    public String getDetalhes()
    {
        return String.format("Smartphone: %s %s | Tela: %.1f\" | Armazenamento: %dGB | Câmera: %dMP | Preço: R$ %.2f",
                getMarca(), getModelo(), tamanhoTela, capacidadeArmazenamento, cameraMegapixels, getPreco());
    }
}
