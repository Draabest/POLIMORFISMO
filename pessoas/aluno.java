package pessoas;
// Classe Aluno que herda de Pessoa
public class aluno extends pessoa {

    // Construtor que inicializa o nome do aluno, passando-o para o construtor da classe Pai (Pessoa)
    public aluno(String nome) {
        super(nome);
    }

    // Implementação do método enviarEmail para o aluno
    @Override
    public String enviarEmail(String mensagem) {
        // Adiciona uma saudação personalizada "Olá Aluno" antes da mensagem
        return "Olá Aluno " + nome + "!\n" + mensagem;
    }
}