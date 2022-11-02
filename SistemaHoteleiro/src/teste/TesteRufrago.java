package teste;

import java.util.ArrayList;
import java.util.List;
import model.Quarto;

public class TesteRufrago {

    public static void main(String[] args) {
        
       List<String> lista = new ArrayList<>();
       lista.add("aa");
       lista.add("bb");
       int inde = lista.size() - 1;
        System.out.println(lista.get(inde));
    }

}
