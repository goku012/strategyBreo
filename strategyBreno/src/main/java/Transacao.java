public class Transacao {

    private float valor;

    public Transacao(float valor) {
        this.valor = valor;
    }

    public float executar(Operacao operacao) {
        return operacao.executar(valor);
    }
}