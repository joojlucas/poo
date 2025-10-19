package main.java;
class Pessoa {
    // atributos privados (encapsulamento)
    private String nome;
    private int idade;

    // construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters (controle de acesso)
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    // método de instância
    public String apresentar() {
        return "Olá, eu sou " + nome + " e tenho " + idade + " anos.";
    }
}
public class ExemploPOO {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 23);
        System.out.println(p.apresentar());
        p.setIdade(24);
        System.out.println(p.apresentar());
    }
}
