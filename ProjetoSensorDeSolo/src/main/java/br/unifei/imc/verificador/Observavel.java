package br.unifei.imc.verificador;

import br.unifei.imc.observadores.Observador;

public interface Observavel {
    void registrar(Observador obs);

    void cancelar(Observador obs);
}
