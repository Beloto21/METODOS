package teste;

public class VerificadorNumero {

    public static void main(String[] args) {
        int numero = -9; // coloque qualquer valor para testar
        String resultado = verificaNumero(numero);
        System.out.println("O número " + numero + " é " + resultado + ".");
    }
    // aqui é para verificar
    public static String verificaNumero(int numero) {
        if (numero >= 0) {
            return "positivo";
        } else {
            return "negativo";
        }
    }
}
