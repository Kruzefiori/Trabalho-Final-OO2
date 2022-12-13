package br.unifei.imc.EstadoDoSolo.corrige;

import br.unifei.imc.plantacaoTipo.Plantacao;

public interface Corrige {
    void corrige_solo(Plantacao plantacao, int umidade, int ph, int fert);
}
