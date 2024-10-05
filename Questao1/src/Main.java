import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();

        int r;

        do {
            System.out.println("Digite 1 para funcionário, digite 2 para gerente ou digite 3 para programador: ");
            int x = sc.nextInt();
            switch (x) {
                case (1):
                    System.out.println("Qual o nome do funcionário?");
                    f.setNome(sc2.nextLine());
                    System.out.println("Qual o ano de nascimento?");
                    f.setNasc(sc.nextInt());
                    f.calcularIdade();
                    System.out.println("Qual o salário?");
                    f.setSalario(sc.nextDouble());
                    break;
                case (2):
                    System.out.println("Qual o seu projeto?");
                    g.setProjeto(sc2.nextLine());
                    g.informarProjeto();
                    break;
                case (3):
                    System.out.println("Qual sua linguagem?");
                    p.setLinguagem(sc2.nextLine());
                    p.informarLinguagem();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Para ver novamente digite 0");
            r = sc.nextInt();
        } while (r ==0);

    }
}