
package validacoes;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class Validacao {
    public static boolean validarEmail(String email){
         boolean result;
        try {
            InternetAddress emailad = new InternetAddress(email);
            emailad.validate();
            result = true;
        } catch (AddressException e) {
            result = false;
        }
        return result;
    }
    
}
