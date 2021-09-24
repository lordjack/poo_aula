package ifsc.slides.slide04;

public class Computador {
    /*
    Utilizando a IntelliJ IDEA crie uma classe denominada Computador
    que deve possuir os seguintes atributos:
        modelo
        quantidade de memória,
        capacidade de disco
        processador
        Adicione métodos	set e get para cada um deles
     */
    String modelo;
    int qtd_memoria;
    int disco;
    String processador;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setQtdMemoria(int qtd_memoria) {
        this.qtd_memoria = qtd_memoria;
    }

    public int getQtdMemoria() {
        return this.qtd_memoria;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public int getDisco() {
        return this.disco;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getProcessador() {
        return this.processador;
    }


}
