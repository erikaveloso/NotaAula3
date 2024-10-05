import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cachorro c = new Cachorro("Richelle", "poddle");
        Gato g = new Gato("Júlia", "Siames");

        int r;

        do {
            System.out.println("Digite 1 para gato e 2 para cachorro: ");
            int x = sc.nextInt();
            switch (x) {
                case (1):
                    System.out.println("Gato");
                    System.out.println("Nome: " + g.getNome());
                    System.out.println("Raça: " + g.getRaca());
                    g.mia();
                    g.caminha();
                    break;
                case (2):
                    System.out.println("Cachorro");
                    System.out.println("Nome: " + c.getNome());
                    System.out.println("Raça: " + c.getRaca());
                    c.late();
                    c.caminha();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Para ver novamente digite 0");
            r = sc.nextInt();
        } while (r ==0);

    }
}