import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner ler = new Scanner(System.in);
     int idade;
     System.out.println("Digite sua idade: ");
     idade = ler.nextInt();

     if (idade < 18) {
        System.out.println("Não pode votar, pois não tem a idade mínima requerida.");
     }
     else {
        System.out.println("Está apto para votar!");
     }

    }
}
