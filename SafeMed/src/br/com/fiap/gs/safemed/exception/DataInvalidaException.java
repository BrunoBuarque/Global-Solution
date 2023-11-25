package br.com.fiap.gs.safemed.exception;

public class DataInvalidaException extends RuntimeException {

    public DataInvalidaException(String mensagem) {
        super(mensagem);
    }
}