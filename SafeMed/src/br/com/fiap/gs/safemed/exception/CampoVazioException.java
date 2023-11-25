package br.com.fiap.gs.safemed.exception;

public class CampoVazioException extends RuntimeException {

    public CampoVazioException(String mensagem) {
        super(mensagem);
    }
}