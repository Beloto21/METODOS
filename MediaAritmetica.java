package teste;

public class MediaAritmetica {

    // aqui calcula a média aritmética de três números
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        // exemplo de uso do método
        double numero1 = 30.0;
        double numero2 = 60.0;
        double numero3 = 90.0;

        double media = calcularMedia(numero1, numero2, numero3);
        System.out.println("A média aritmética é: " + media);
    }
}

