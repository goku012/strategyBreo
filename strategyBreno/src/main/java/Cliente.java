public class Cliente {

    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        Transacao transacao = new Transacao(valor);
        this.saldo += transacao.executar(new OperacaoDeposito());
    }

    public void sacar(float valor) {
        Transacao transacao = new Transacao(valor);
        this.saldo -= transacao.executar(new OperacaoSaque());
    }

    public void transferir(float valor, Cliente destinatario) {
        Transacao transacaoSaque = new Transacao(valor);
        Transacao transacaoDeposito = new Transacao(valor);
        this.saldo -= transacaoSaque.executar(new OperacaoSaque());
        destinatario.depositar(transacaoDeposito.executar(new OperacaoDeposito()));
    }

}