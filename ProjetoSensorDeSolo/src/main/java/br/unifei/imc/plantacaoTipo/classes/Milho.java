package br.unifei.imc.plantacaoTipo.classes;

import br.unifei.imc.plantacaoTipo.Plantacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class Milho extends Plantacao {
    private int umidade, ph, fertilizante;
    public Milho() {
        umidade = 50;
        ph = 7;
        fertilizante = 60;
    }
}
