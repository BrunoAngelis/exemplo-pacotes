package lanchonete.atendimento;

public class Atendente {

    public void servirMesa(){
        System.out.println("SERVINDO MESA");
        pegarLancheCozinha();
    }

    private void pegarLancheCozinha(){
        System.out.println("PEGANDO LANCHE NA COZINHA");
        pegarPedidoNoBalcao();
    }

    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }

    public void trocarGas(){
        System.out.println("TROCANDO GAS");
    }

    private void pegarPedidoNoBalcao(){
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
