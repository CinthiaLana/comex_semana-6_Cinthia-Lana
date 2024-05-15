package br.com.alura.comex.main;

import br.com.alura.comex.models.Produto;

import java.math.BigDecimal;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Mouse Microsoft",null, new BigDecimal("89.00"),15);
        Produto produto2 = new Produto("Teclado Logitech",null, new BigDecimal("120.00"),10);
        Produto produto3 = new Produto("Monitor Dell",null, new BigDecimal("800.00"),5);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);

        System.out.println(produto1.imprimirDados());
        System.out.println(produto2.imprimirDados());
        System.out.println(produto3.imprimirDados());
    }
}
