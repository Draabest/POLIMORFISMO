package pessoas;
// Classe Professor que herda de Pessoa

public class professor extends pessoa {
    
    // Construtor que inicializa o nome do professor, passando-o para o construtor da classe Pai (Pessoa)
    public professor(String nome) {
        super(nome);
    }

    // Implementação do método enviarEmail para o professor
    @Override
    public String enviarEmail(String mensagem) {
        // Adiciona uma saudação personalizada "Olá Prof." antes da mensagem
        return "Olá Prof. " + nome + "!\n" + mensagem;
    }
}