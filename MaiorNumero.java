package teste;

public class MaiorNumero {
	// para digitar os numeros
    public static void main(String[] args) {
        int num1 = 150;
        int num2 = 2000;
        int num3 = 151;

        int maior = encontrarMaior(num1, num2, num3);
        System.out.println("O maior número é: " + maior);
    }
    // aqui é para encotrar o maior numero
    public static int encontrarMaior(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        return maior;
    }
}
