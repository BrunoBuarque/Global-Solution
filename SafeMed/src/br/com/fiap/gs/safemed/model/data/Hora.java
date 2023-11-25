package br.com.fiap.gs.safemed.model.data;

import br.com.fiap.gs.safemed.exception.*;

public class Hora {

    // Atributos
    private int hora, minuto, segundo;

    // Construtores
    public Hora(int hora, int minuto, int segundo) {
        super();
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Validar a Hora
    public boolean validarHora() {
        if (hora < 0 || hora > 23) {
            hora = 0;
            throw new HoraInvalidaException("Hora inválida. A hora deve estar entre 0 e 23.");
        }
        return true;
    }

    // Validar o Minuto
    public boolean validarMinuto() {
        if (minuto < 0 || minuto > 59) {
            minuto = 0;
            throw new HoraInvalidaException("Minuto inválido. O minuto deve estar entre 0 e 59.");
        }
        return true;
    }

    // Validar o Segundo
    public boolean validarSegundo() {
        if (segundo < 0 || segundo > 59) {
            segundo = 0;
            throw new HoraInvalidaException("Segundo inválido. O segundo deve estar entre 0 e 59.");
        }
        return true;
    }

    // Exibir a Hora no formato hh:mm:ss
    public String retornarHora() {
        validarHora();
        validarMinuto();
        validarSegundo();
        return hora + ":" + minuto + ":" + segundo;
    }

    // Getters e Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
