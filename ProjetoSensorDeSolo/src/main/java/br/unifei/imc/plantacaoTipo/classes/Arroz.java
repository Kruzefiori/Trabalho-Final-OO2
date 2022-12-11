package br.unifei.imc.plantacaoTipo.classes;

import br.unifei.imc.plantacaoTipo.Plantacao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Arroz extends Plantacao {
    private int umidade, ph, fertilizante;
    public Arroz() {
        umidade = 90;
        ph = 5;
        fertilizante = 60;
    }
}
