package teste;

public class TempoConverter {

    // aqui converte minutos em horas e minutos
    public static String converterMinutos(int minutos) {
        // verifica se a quantidade de minutos é negativa
        if (minutos < 0) {
            return "Por favor, insira um número de minutos não negativo.";
        }

        // calcula o número de horas
        int horas = minutos / 60; // Divisão inteira para obter as horas
        // calcula o número restante de minutos
        int minutosRestantes = minutos % 60; // Módulo para obter os minutos restantes

        // retorna o resultado formatado
        return horas + " hora(s) e " + minutosRestantes + " minuto(s)";
    }

    public static void main(String[] args) {
       
        int minutosTeste = 90;
        String resultado = converterMinutos(minutosTeste);
        System.out.println(minutosTeste + " min = " + resultado); // Exibe o resultado
    }
}

