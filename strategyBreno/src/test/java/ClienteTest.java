import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveDepositarValorNaConta() {
        Cliente cliente = new Cliente();
        cliente.depositar(100.0f);
        assertEquals(100.0f, cliente.getSaldo());
    }

    @Test
    void deveSacarValorDaConta() {
        Cliente cliente = new Cliente();
        cliente.depositar(100.0f);
        cliente.sacar(50.0f);
        assertEquals(150.0f, cliente.getSaldo());
    }

    @Test
    void deveTransferirValorParaOutraConta() {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.depositar(100.0f);
        cliente1.transferir(50.0f, cliente2);
        assertEquals(150.0f, cliente1.getSaldo());
        assertEquals(50.0f, cliente2.getSaldo());
    }
}