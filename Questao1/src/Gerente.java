public class Gerente extends Funcionario {
    private String projeto;

    public void informarProjeto(){
        System.out.println("Seu projeto é: " + projeto);
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
