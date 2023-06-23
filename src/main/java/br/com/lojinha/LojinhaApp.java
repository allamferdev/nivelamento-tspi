package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp{
    public static void main(String[] args) throws Exception {
        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("Cinto");
        itensInclusos.add("Cordão");
        itensInclusos.add("Camisa");
        itensInclusos.add("Calça");

        Produto produto = new Produto("Reserva", "Kit dia dos pais", Tamanho.GRANDE, itensInclusos, 250.00);

        System.out.println(produto);
    }
}
