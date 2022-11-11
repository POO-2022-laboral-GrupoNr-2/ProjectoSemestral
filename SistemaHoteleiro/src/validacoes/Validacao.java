package validacoes;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * Esta classe contem alguns metodos para facilitar o processo de validar os
 * valores dos campos nas telas.
 *
 * @author
 */
public class Validacao {

    /**
     * Metodo para a validacao do email.
     *
     * @param email email a ser verificado.
     * @return true se o email for valido.
     */
    public static boolean validarEmail(String email) {
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
