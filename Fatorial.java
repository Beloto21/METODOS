package teste;

public class Fatorial {

    // aqui calcula o fatorial de um número inteiro não negativo
    public static long calcularFatorial(int n) {
        // verifica se o número é negativo
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        
        // variável que armazenará o resultado
        long fatorial = 1;

        // calcula o fatorial usando um loop
        for (int i = 1; i <= n; i++) {
            fatorial *= i; // Multiplica o fatorial pelo número atual
        }

        return fatorial;
    }

    public static void main(String[] args) {
        // função com um exemplo
        int numero = 10; 
        long resultado = calcularFatorial(numero); 
        System.out.println("O fatorial de " + numero + " é: " + resultado); // Exibe o resultado
    }
}

