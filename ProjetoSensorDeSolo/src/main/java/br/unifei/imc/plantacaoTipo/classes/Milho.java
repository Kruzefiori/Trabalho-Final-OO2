package br.unifei.imc.plantacaoTipo.classes;

import br.unifei.imc.plantacaoTipo.Plantacao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Milho extends Plantacao {
    public Milho(int umidade, int ph, int fertilizante) {
        this.umidade = 70;
        this.ph = 7;
        this.fertilizante = 80;
    }
}
