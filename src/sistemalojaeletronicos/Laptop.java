package sistemalojaeletronicos;

public class Laptop extends Produto
{
    private String processador;
    private int memoriaRAM;
    private double tamanhoTela;

    public Laptop(String marca, String modelo, double preco, String processador, int memoriaRAM, double tamanhoTela)
    {
        super(marca, modelo, preco);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.tamanhoTela = tamanhoTela;
    }

    public String getProcessador() { return processador; }
    public void setProcessador(String processador) { this.processador = processador; }

    public int getMemoriaRAM() { return memoriaRAM; }
    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    public double getTamanhoTela() { return tamanhoTela; }
    public void setTamanhoTela(double tamanhoTela) { this.tamanhoTela = tamanhoTela; }

    @Override
    public String getDetalhes()
    {
        return String.format("Laptop: %s %s | Processador: %s | RAM: %dGB | Tela: %.1f\" | Preço: R$ %.2f",
                getMarca(), getModelo(), processador, memoriaRAM, tamanhoTela, getPreco());
    }
}
