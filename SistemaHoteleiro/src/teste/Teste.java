
package teste;

import model.Cliente;
import model.Funcionario;
import model.Produto;


public class Teste {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("Rufrago", "Hotel", "Male", "Mozambican", "20/20/20", "123456789", "84848484", "rufrago@gmail.com", "Hotelaria", "Suite", 120.0, 12, "12/12/12", "13/13/13");
        Produto produ2 = new Produto(6, 200.2, 190.2, "Maaauuu", "2050");
        produ2.cadastrarProduto(produ2);
        
        //Funcionario funcio = new Funcionario("Rui", "Paulo", "Guy", "Jj", "M", "15/48", "878778d", "854", "@gmail", "Longe", "boss", "On");
        //funcio.salvarFuncionario(funcio);
    }
    
}
