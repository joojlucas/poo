package main.java;
interface Falante {
    String falar();
}

class Animal {
    protected String nome;     // protegido: visível para subclasses

    public Animal(String nome) { this.nome = nome; }

    public String mover() { return "se movendo..."; }
}

class Cachorro extends Animal implements Falante {
    public Cachorro(String nome) { super(nome); }

    @Override
    public String falar() { return "Au au! Eu sou " + nome; }

    @Override
    public String mover() { return "correndo com 4 patas"; }
}

class Gato extends Animal implements Falante {
    public Gato(String nome) { super(nome); }

    @Override
    public String falar() { return "Miau! Eu sou " + nome; }
}

public class ExemploHeranca {
    public static void main(String[] args) {
        Falante f1 = new Cachorro("Bolt");   // polimorfismo via interface
        Falante f2 = new Gato("Mia");

        System.out.println(f1.falar());
        System.out.println(f2.falar());

        Animal a = new Cachorro("Rex");
        System.out.println(a.mover());        // usa a versão sobrescrita de Cachorro
    }
}
