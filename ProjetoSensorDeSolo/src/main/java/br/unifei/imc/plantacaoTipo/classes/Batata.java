package br.unifei.imc.plantacaoTipo.classes;

import br.unifei.imc.plantacaoTipo.Plantacao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Batata extends Plantacao {
    private int umidade, ph, fertilizante;
    public Batata() {
        umidade = 40;
        ph = 5;
        fertilizante = 50;
    }
}
