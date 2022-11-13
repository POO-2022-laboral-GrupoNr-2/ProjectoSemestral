package validacoes;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.apache.commons.lang3.StringUtils;

/**
 * Esta classe e composta por metodos que nos permitem efectuar a validacao dos
 * valores nos campos dos formularios nas telas.
 *
 *
 * @author Augusto Chissano
 * @author Edilson Ricardo
 * @author Francisco Junior
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

    /**
     * Este metodo faz a validacao de um contacto, e um contacto sera valido
     * caso o prefixo seja 82/84/85/86/87 e contenha 9 digitos.
     *
     * @param contacto a ser validado.
     * @return true caso o contacto seja valido.
     */
    public static boolean validarContacto(String contacto) {
        if (contacto.length() != 9 || contacto.isEmpty()) {
            return false;
        } else {
            if (StringUtils.isNumeric(contacto)) {
                if (StringUtils.startsWith(contacto, "84") || StringUtils.startsWith(contacto, "86") || StringUtils.startsWith(contacto, "82") || StringUtils.startsWith(contacto, "85") || StringUtils.startsWith(contacto, "87")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Este metodo faz a validacao dos textos que serao inseridos pelo usuario
     * nas fields, verifica se as fields estao null ou se contem numeros.
     *
     * @param texto a ser validado
     * @return true caso o texto seja valido
     */
    public static boolean validarTexto(String texto) {
        if (texto.isEmpty() || StringUtils.isNumeric(texto)) {
            return false;
        } else {
            if (StringUtils.isAlphaSpace(texto)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este metodo faz a validacao do BI, que so sera valido caso contenha 13
     * caracteres onde 12 sao digitos e 1 uma letra.
     *
     * @param numero dado a ser verificado.
     * @return true caso seja valido.
     */
    public static boolean validarBi(String numero) {
        if (numero.length() != 13 || numero.isEmpty()) {
            return false;
        } else {
            String letter = String.valueOf(numero.charAt(12));
            String numbers = numero.substring(0, 11);
            if (StringUtils.isNumeric(numbers) && StringUtils.isAlpha(letter)) {
                return true;
            }

        }
        return false;
    }

}
