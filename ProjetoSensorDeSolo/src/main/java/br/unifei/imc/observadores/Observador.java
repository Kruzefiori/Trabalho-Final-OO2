package br.unifei.imc.observadores;

import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;

public interface Observador{
    void atualiza(TiposEstadoDoSolo tipo, int um, int fert, int ph);
}
