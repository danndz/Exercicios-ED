public class QuatroNotas {
    public static void main(String[] args) {
        
        int[] notas = {5, 3, 6, 8};
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        int media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}