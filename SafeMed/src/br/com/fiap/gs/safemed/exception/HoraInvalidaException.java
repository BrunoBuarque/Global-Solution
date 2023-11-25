package br.com.fiap.gs.safemed.exception;

public class HoraInvalidaException extends RuntimeException {

    public HoraInvalidaException(String mensagem) {
        super(mensagem);
    }
}