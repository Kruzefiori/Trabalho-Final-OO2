package br.unifei.imc.plantacaoTipo.classes;

import br.unifei.imc.plantacaoTipo.Plantacao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Soja extends Plantacao {
    private int umidade, ph, fertilizante;
    public Soja() {
        umidade = 65;
        ph = 6;
        fertilizante = 70;
    }
}
