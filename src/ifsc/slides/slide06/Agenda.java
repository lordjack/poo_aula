package ifsc.slides.slide06;

public class Agenda {
    private int dia;
    private int mes;
    private String anotacao;

    public void anote(int d, int m, String anotacao) {
        this.dia = d;
        this.mes = m;
        this.anotacao = anotacao;
    }

    private void validaData() {
        if ((this.dia < 1) || (this.dia > 31) || (this.mes < 1) || (this.mes > 12)) {
            System.out.println("A data estar inválida!");
        } else {
            System.out.println("A data é válida!");
        }
    }

    public void mostrarAnotacao() {
        System.out.println(this.dia + "/" + this.mes + " : " + this.anotacao);
    }
}
