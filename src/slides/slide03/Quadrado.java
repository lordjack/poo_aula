package slides.slide03;

public class Quadrado {
    /*
    Quadrado
     - Descreva os atributos e métodos de uma figura geométrica quadrado
     - Construa uma classe com a abstração que atingiu
     - Construa um programa para utilizar os métodos de classe
     */
    String cor;
    float medida;
    float espacoPreenchido;

    void preencherEspaco(float largura, float altura) {
        System.out.println("Espaço Preenchido");
        if (this.espacoPreenchido < 200) {
            this.espacoPreenchido = largura * altura;
        } else {
            System.out.println("A largura e altura informada é maior que o espaço do quadrado");
            System.exit(1);
        }
    }

    void informarCor(String cor) {
        this.cor = cor;
    }

    void informarMedida(float medida) {
        this.medida = medida;
    }

    void imprimirQuadrado() {
        System.out.println("A cor do quadrado é: " + this.cor
                + " A medida é: " + this.medida
        );
        System.err.println("O espaço preenchido é: " +
                (100 * (this.espacoPreenchido) / this.medida) + "%");
    }

}
