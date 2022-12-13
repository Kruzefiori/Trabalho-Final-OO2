package br.unifei.imc.plantacaoTipo.classes;

import br.unifei.imc.plantacaoTipo.Plantacao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cafe extends Plantacao {
    private int umidade, ph, fertilizante;
    public Cafe() {
        umidade = 40;
        ph = 6;
        fertilizante = 60;
    }
}
