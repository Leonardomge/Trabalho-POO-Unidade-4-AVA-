package sistemalojaeletronicos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras
{
    private final List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens)
        {
            if (item.getProduto().equals(produto))
            {
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.printf("  Quantidade de '%s %s' atualizada para %d unidade(s).%n",
                        produto.getMarca(), produto.getModelo(), item.getQuantidade());
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
        System.out.printf("  '%s %s' adicionado ao carrinho (x%d).%n",
                produto.getMarca(), produto.getModelo(), quantidade);
    }

    public void removerProduto(Produto produto)
    {
        boolean removido = itens.removeIf(item -> item.getProduto().equals(produto));
        if (removido)
        {
            System.out.printf("  '%s %s' removido do carrinho.%n",
                    produto.getMarca(), produto.getModelo());
        }
        else
        {
            System.out.printf("  Produto '%s %s' não encontrado no carrinho.%n",
                    produto.getMarca(), produto.getModelo());
        }
    }

    public double calcularTotal()
    {
        double total = 0;
        for (ItemCarrinho item : itens)
        {
            total += item.getSubtotal();
        }
        return total;
    }

    public void exibirCarrinho()
    {
        if (itens.isEmpty())
        {
            System.out.println("  O carrinho está vazio.");
            return;
        }
        System.out.println("  " + "-".repeat(75));
        for (ItemCarrinho item : itens)
        {
            System.out.println(item);
        }
        System.out.println("  " + "-".repeat(75));
        System.out.printf("  TOTAL A PAGAR: R$ %.2f%n", calcularTotal());
        System.out.println("  " + "-".repeat(75));
    }

    public List<ItemCarrinho> getItens() { return itens; }
    public boolean estaVazio() { return itens.isEmpty(); }
}
