package sistemalojaeletronicos;

public class Main
{
    public static void main(String[] args)
    {
        Smartphone s1 = new Smartphone("Samsung", "Galaxy S26", 4999.99, 6.2, 256, 200);
        Smartphone s2 = new Smartphone("Apple",   "Iphone 17",  6499.90, 6.1, 128,  48);

        Laptop l1 = new Laptop("Dell",  "XPS 15",      7299.00, "Intel Core i7",  16, 15.6);
        Laptop l2 = new Laptop("Apple", "MacBook Pro", 12999.00, "Apple M3 Pro",  18, 14.2);

        TV tv1 = new TV("LG",      "OLED C3",     4799.00, 55, "4K",      true);
        TV tv2 = new TV("Samsung", "Crystal UHD", 2199.00, 50, "4K",      true);


        System.out.println("  CATÁLOGO DE PRODUTOS DA LOJA  ");


        Produto[] catalogo = { s1, s2, l1, l2, tv1, tv2 };
        for (Produto p : catalogo)
        {
            System.out.println(p.getDetalhes());
        }


        System.out.println("     CLIENTES     ");

        Cliente leo  = new Cliente("Leonardo Elias",  "237.456.789-47", "leonardomge@gmail.com");
        Cliente maria = new Cliente("Maria Carolina Elias", "137.654.321-47", "mariacarolinamge@gmail.com");

        System.out.println(leo);
        System.out.println(maria);


        System.out.println("\n Leo está montando seu carrinho:");
        leo.adicionarAoCarrinho(s1,  1);
        leo.adicionarAoCarrinho(l1,  1);
        leo.adicionarAoCarrinho(tv1, 2);
        leo.adicionarAoCarrinho(s1,  1);

        // Maria Carolina adiciona produtos ao carrinho
        System.out.println("\n Maria está montando seu carrinho:");
        maria.adicionarAoCarrinho(s2, 2);
        maria.adicionarAoCarrinho(l2, 1);
        maria.adicionarAoCarrinho(tv2, 1);

        // Exibindo os carrinhos e totais
        leo.exibirCarrinho();
        maria.exibirCarrinho();

        // Leo remove um produto do carrinho
        System.out.println("\n Leo decidiu remover a TV do carrinho:");
        leo.removerDoCarrinho(tv1);
        leo.exibirCarrinho();


        System.out.println("  RESUMO DE PEDIDOS   ");

        System.out.printf("  %-20s → Total a pagar: R$ %.2f%n", leo.getNome(),  leo.calcularTotal());
        System.out.printf("  %-20s → Total a pagar: R$ %.2f%n", maria.getNome(), maria.calcularTotal());

    }


}
