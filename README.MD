1. O que é POO?

A Programação Orientada a Objetos é um paradigma que utiliza "objetos" para modelar dados e comportamentos. O objetivo é organizar o código de maneira que seja mais fácil de entender, manter e reutilizar.

2. Conceitos Básicos da POO

Os quatro pilares principais da POO são:

    Encapsulamento: O encapsulamento oculta os detalhes internos de uma classe e expõe apenas o que é necessário. Isso é feito através de modificadores de acesso (como private, public, e protected).

    Herança: Permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). Isso promove a reutilização de código.

    Polimorfismo: Permite que métodos tenham diferentes comportamentos com base no objeto que os chama. Isso pode ser feito através de sobrecarga de métodos ou sobreposição (override).

    Abstração: Permite focar nos aspectos essenciais de um objeto, ignorando detalhes desnecessários. Isso é frequentemente implementado com classes abstratas e interfaces.

3. Criando Classes e Objetos em Java
Classe

Uma classe é um modelo para criar objetos. Ela define atributos (variáveis) e métodos (funções) que os objetos daquela classe terão.

java

class Carro {
    // Atributos
    String modelo;
    int ano;

    // Método
    void dirigir() {
        System.out.println("Dirigindo o carro " + modelo);
    }
}

Objeto

Um objeto é uma instância de uma classe.

java

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1976;
        
        meuCarro.dirigir(); // Chama o método dirigir
    }
}

4. Encapsulamento

Use modificadores de acesso para controlar o acesso aos atributos.

java

class Carro {
    private String modelo; // Atributo privado
    private int ano;

    // Métodos públicos para acessar os atributos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

5. Herança

Uma classe pode herdar de outra usando a palavra-chave extends.

java

class Veiculo {
    void mover() {
        System.out.println("Veículo se movendo.");
    }
}

class Carro extends Veiculo {
    void dirigir() {
        System.out.println("Dirigindo o carro.");
    }
}

6. Polimorfismo

Você pode ter métodos com o mesmo nome, mas comportamentos diferentes.

java

class Animal {
    void fazerSom() {
        System.out.println("Animal faz som.");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Cachorro late.");
    }
}

7. Abstração

Use classes abstratas e interfaces para definir contratos.

java

abstract class Forma {
    abstract void desenhar(); // Método abstrato
}

class Circulo extends Forma {
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

Resumo

A POO em Java permite criar programas mais organizados e reutilizáveis. A prática com esses conceitos é essencial para se tornar proficiente. Tente criar suas próprias classes e objetos para entender melhor como tudo funciona.

Se você tiver alguma dúvida específica ou quiser aprofundar em algum conceito, é só avisar!
