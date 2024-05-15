package br.com.alura.comex.main;

import br.com.alura.comex.models.Cliente;
import br.com.alura.comex.models.Endereco;

public class MainClienteEndereco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(); //instanciando com construtor padrão

        Endereco enderecoCliente1 = new Endereco("São Paulo","São Paulo","SP","Eusébio Stavaux",823);

        cliente1.setNome("João Silva");
        cliente1.setCpf("12345678900");
        cliente1.setEmail("joao@exemplo.com");
        cliente1.setProfissao("Engenheiro");
        cliente1.setTelefone("1198765432");
        cliente1.setEndereco(enderecoCliente1);

        System.out.println(cliente1);
    }
}

