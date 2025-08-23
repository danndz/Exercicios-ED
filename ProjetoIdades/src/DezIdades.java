public class DezIdades {
    public static void main(String[] args) {
        
        int[] idades = {15, 67, 12, 43, 21, 17, 35, 10, 58, 72};

        System.out.print("As idades maiores que 18 anos são: ");

        for (int idade : idades) {   
            if (idade > 18) {
                System.out.print(idade + ", ");
            }
        }
    }
}