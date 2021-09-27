package ifsc.slides.slide06;

public class MainAgenda {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();

        agenda1.anote(12, 10, "Dia da Criança");
        agenda2.anote(7, 9, "Dia da Independência do Brasil");

        agenda1.mostrarAnotacao();
      //  agenda1.validaData();
        agenda2.mostrarAnotacao();

      //  agenda2.dia = 10; //erro!
      //  agenda2.mes = 11; //erro
      //  agenda2.anotacao = "Dia da Independência do Brasil"; //erro!

        agenda2.mostrarAnotacao();
    }
}
