import java.util.Scanner;

public class Teste_de_Ansiedade {

    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de entradas do usuário
        Scanner scanner = new Scanner(System.in);
        int cont = 0; // Contador para respostas "sim"

        // Array contendo as perguntas a serem feitas
        String[] perguntas = {
            "1. Você se sente com dificuldade de concentração?", 
            "2. Você se sente cansado facilmente?",
            "3. Tem dificuldade em adormecer ou permanecer a dormir?", 
            "4. Você se preocupa muito com o futuro?",
            "5. Tem dificuldade em relaxar?", 
            "6. Sentiu-se tão preocupado que foi difícil ficar parado?",
            "7. Sentiu-se facilmente irritável ou chateado?",
            "8. Sentiu medo como se algo de muito ruim fosse acontecer?",
            "9. Você se preocupa com a opinião dos outros?",
            "10. Você está com dificuldade em lembrar dos detalhes?"
        };

        // Loop para percorrer cada pergunta
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            boolean respostainvalida = false; // Flag para controlar a validade da resposta

            // Loop até que uma resposta válida seja dada
            while (!respostainvalida) {
                String resposta = scanner.nextLine(); // Lê a resposta do usuário

                // Verifica se a resposta é "sim"
                if (resposta.equalsIgnoreCase("Sim")) {
                    cont++; // Incrementa o contador
                    respostainvalida = true; // Sai do loop
                } 
                // Verifica se a resposta é "não"
                else if (resposta.equalsIgnoreCase("Não")) {
                    respostainvalida = true; // Sai do loop sem incrementar
                } 
                // Se a resposta for inválida
                else {
                    System.out.println("Resposta inválida. Por favor, responda 'Sim' ou 'Não'.");
                    System.out.println(pergunta); // Reexibe a pergunta
                }
            }
        }

        // Avalia o resultado baseado nas respostas
        if (cont >= 7) {
            System.out.println("Você possui fortes indícios de ansiedade. Faça terapia.");
        } else if (cont < 5) {
            System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
        } else {
            System.out.println("Você precisa cuidar do seu corpo e da mente. Procure orientação médica.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
