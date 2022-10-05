package Modelo;

public abstract class Pessoa {

    protected String nome, apelido, genero, datadeNascimento, email, numeroDeBI, contacto, contactoSecundario, Nuit, morada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDeBI() {
        return numeroDeBI;
    }

    public void setNumeroDeBI(String numeroDeBI) {
        this.numeroDeBI = numeroDeBI;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getContactoSecundario() {
        return contactoSecundario;
    }

    public void setContactoSecundario(String contactoSecundario) {
        this.contactoSecundario = contactoSecundario;
    }

    public String getNuit() {
        return Nuit;
    }

    public void setNuit(String Nuit) {
        this.Nuit = Nuit;
    }

}
