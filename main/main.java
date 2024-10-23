package main;

import pessoas.aluno;
import pessoas.pessoa;
import pessoas.professor;

// Classe principal que testa o envio de e-mails para Professor e Aluno
public class main {
    public static void main(String[] args) {
        // Cria um objeto do tipo Professor com o nome "Alan Turing"
        pessoa professor = new professor("Alan Turing");
            
        // Cria um objeto do tipo Aluno com o nome "Joseph"
        pessoa aluno = new aluno("Joseph");

        // Mensagens de exemplo que serão enviadas
        String mensagemProfessor =  "Venho por meio deste e-mail para informa-lo que nao estarei presente na proxima aula.\\n" + //
        " Obrigado e desculpe qualquer conveniencia.";

        String mensagemAluno ="Venho por meio deste email pois notei que voce nao fez a atividade x. Peco que veja me enviou corretamente o arquivo.\n"+ //
                    "Obrigado pela atencao e desculpe qualquer conveniencia";

        // Envia o e-mail para o professor e imprime a mensagem
        System.out.println(professor.enviarEmail(mensagemProfessor));
        
        // Envia o e-mail para o aluno e imprime a mensagem
        System.out.println(aluno.enviarEmail(mensagemAluno));
    }
}