package teste;

public class Potenciador {

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }
    // aqui é para ele calcular a potencia
    public static void main(String[] args) {
        double base = 70;
        double expoente = 7;
        double resultado = potencia(base, expoente);
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }
}

