
package teste;

import model.Cliente;
import model.Funcionario;


public class Teste {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("Rufrago", "Hotel", "Male", "Mozambican", "20/20/20", "123456789", "84848484", "rufrago@gmail.com", "Hotelaria", "Suite", 120.0, 12, "12/12/12", "13/13/13");
        Cliente cliente2 = new Cliente("Rufrago", "Hotel", "Male", "Mozambican", "20/20/20", "123456789", "84848484", "rufrago@gmail.com", "Hotelaria", "Suite", 120.0, 12, "12/12/12", "13/13/13");
        cliente2.cadastrarCliente(cliente2);
        
        //Funcionario funcio = new Funcionario("Rui", "Paulo", "Guy", "Jj", "M", "15/48", "878778d", "854", "@gmail", "Longe", "boss", "On");
        //funcio.salvarFuncionario(funcio);
    }
    
}
