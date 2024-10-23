package pessoas;
// Classe abstrata Pessoa que serve de base para Professor e Aluno
public abstract class pessoa {
    protected String nome; // Nome da pessoa (Professor ou Aluno)

    // Construtor que inicializa o nome da pessoa
    public pessoa(String nome) {
        this.nome = nome;
    }

    // Método abstrato para envio de e-mail, que será implementado pelas subclasses
    public abstract String enviarEmail(String mensagem);
}