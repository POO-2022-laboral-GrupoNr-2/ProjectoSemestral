
package teste;

import model.Cliente;


public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rufrago", "Hotel", "Male", "Mozambican", "20/20/20", "123456789", "84848484", "rufrago@gmail.com", "Hotelaria", "Suite", 120.0, 12, "12/12/12", "13/13/13");
        cliente.cadastrarCliente(cliente);
    }
    
}
