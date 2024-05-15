package br.com.alura.comex.main;

import br.com.alura.comex.models.Cliente;
import br.com.alura.comex.models.Endereco;
import br.com.alura.comex.models.Pedido;
import br.com.alura.comex.models.Produto;
import br.com.alura.comex.services.FiltroPedidoPorValor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPedido {
    public static void main(String[] args) {
        Cliente cliente1 = criarCliente("João Silva", "12345678900", "joao@exemplo.com", "Engenheiro", "1198765432", new Endereco("Centro", "São Paulo", "ap 123", "SP", "Rua das Flores", 123));
        Cliente cliente2 = criarCliente("Maria Pereira", "98765432100", "maria@exemplo.com", "Designer", "1191234567", new Endereco("Jardins", "São Paulo", "ap 456", "SP", "Avenida Paulista", 456));

        Produto produto1 = new Produto("Monitor Dell","Modelo D091231",new BigDecimal("500.00"),1);
        Produto produto2 = new Produto("Teclado Logitech","Modelo L091231",new BigDecimal("150.00"),2);
        Produto produto3 = new Produto("Mouse Genérico",new BigDecimal("50.00"),2);
        Produto produto4 = new Produto("SSD Samsung",new BigDecimal("800.00"),1);

        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(new Pedido(1, 3, cliente1, produto1));
        listaPedidos.add(new Pedido(2, 5, cliente1, produto2));
        listaPedidos.add(new Pedido(3, 1, cliente1, produto3));
        listaPedidos.add(new Pedido(4, 10, cliente2, produto3));
        listaPedidos.add(new Pedido(5, 1, cliente1, produto4));

        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido);
        }

        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido.sintetizarPedido());
        }

        Collections.sort(listaPedidos,new FiltroPedidoPorValor().reversed());
        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido.sintetizarPedido());
        }

        Collections.sort(listaPedidos,new FiltroPedidoPorValor());
        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido.sintetizarPedido());
        }
    }

    private static Cliente criarCliente(String nome, String cpf, String email, String profissao, String telefone, Endereco endereco) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        cliente.setProfissao(profissao);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        return cliente;
    }
}

