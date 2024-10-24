import java.util.Scanner;

public class Main {

    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        // Itera sobre a lista de velocidades
        for (String v : velocidades) {
            // Converte string para inteiro e verifica se há uma velocidade igual a 0
            if (Integer.parseInt(v.trim()) == 0) {
                return "Queda de Conexao";
            }
        }
        // Se não houver valores iguais a 0, retorna "Sem Quedas"
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
