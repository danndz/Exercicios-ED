public class QuatroNotas {
    public static void main(String[] args) {
        
        int[] notas = {5, 3, 6, 8};
        int num = 0;

        for (int i = 0; i < notas.length; i++) {
            num += notas[i];
        }

        int media = num / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}