public class ParametrosInvalidosException extends Exception {
    
    private final String mensagem;

    public ParametrosInvalidosException() {
        this.mensagem = "O segundo parâmetro deve ser maior que o primeiro!";
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}