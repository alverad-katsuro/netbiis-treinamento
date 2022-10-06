package com.curso2.unidade4;

/**
 * SisalucarApp
 */
public class SisalucarApp {

    public static void main(String[] args) {
        var locacaoLista = Locacao.getLocacaoList();
        Cliente cliente_um = new Cliente("Cliente um", "000.000.000-00", "123134");
        Cliente cliente_dois = new Cliente("Cliente dois", "000.010.000-00", "123332");
        Carro celta = new Carro("Celta", "Prata", "Chevrolet", "v12", 2020, 150f, "nss-1111", Revendedor.RRCAR);
        Carro lamb = new Carro("Lamborguini", "Vermelha", "Lamborguini", "v30", 2000, 1500f, "nss-2222", Revendedor.ABC);
        Locacao.realizarLocacao(0, 0, 150f, "2022-10-02");
        Locacao.realizarLocacao(1, 1, 1500f, "2022-10-02");
        Locacao.realizarLocacao(1, 1, 1500f, "2022-11-10","2022-11-12");

        System.out.println(locacaoLista.size());
        Locacao.gerarRelatorio("2022-10-02", "2022-12-02");
    }
}