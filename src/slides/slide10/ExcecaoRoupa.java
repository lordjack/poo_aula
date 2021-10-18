package slides.slide10;

public class ExcecaoRoupa extends Exception {
    public ExcecaoRoupa(String mensagem) { //metodo construtor
        super(mensagem);
    }

    @Override
    public String getMessage() {
        return "Voce não está utilizando a roupa de forma adequada!";
    }
}