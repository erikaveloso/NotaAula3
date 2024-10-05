public class Animal {
    protected String nome, raca;

    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void caminha(){
        System.out.println(this.nome + " caminha com quatro patas.");
    }

    public Animal(){

    }


}
