package sistemalojaeletronicos;

public class TV extends Produto
{
    private double tamanhoTela;
    private String resolucao;
    private boolean smartTV;

    public TV(String marca, String modelo, double preco, double tamanhoTela, String resolucao, boolean smartTV)
    {
        super(marca, modelo, preco);
        this.tamanhoTela = tamanhoTela;
        this.resolucao = resolucao;
        this.smartTV = smartTV;
    }

    public double getTamanhoTela() { return tamanhoTela; }
    public void setTamanhoTela(double tamanhoTela) { this.tamanhoTela = tamanhoTela; }

    public String getResolucao() { return resolucao; }
    public void setResolucao(String resolucao) { this.resolucao = resolucao; }

    public boolean isSmartTV() { return smartTV; }
    public void setSmartTV(boolean smartTV) { this.smartTV = smartTV; }

    @Override
    public String getDetalhes()
    {
        return String.format("TV: %s %s | Tela: %.0f\" | Resolução: %s | Smart TV: %s | Preço: R$ %.2f",
                getMarca(), getModelo(), tamanhoTela, resolucao, smartTV ? "Sim" : "Não", getPreco());
    }
}

