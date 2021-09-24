package ifsc.slides.slide03;

public class AgenciaBancaria {

    /*
Agência bancária
   - Descreva os atributos e métodos de uma conta corrente e uma agência bancária
   - Construa as classes com a abstração que atingiu, criando métodos estatísticos para controlar o número de contas
   - Construa um programa para utilizar os métodos da classe
     */

    String nome;
    int cpf;
    int agencia;
    int conta;
    float saldo = 0;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCPF() {
        return this.cpf;
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    public void depositar(float valor) {
        System.out.println("Foi depositado : " + valor);
        this.saldo = this.saldo + valor;
    }

    public void sacar(float valor) {
        System.out.println("Foi sacado : " + valor);
        this.saldo = this.saldo - valor;
    }

}
