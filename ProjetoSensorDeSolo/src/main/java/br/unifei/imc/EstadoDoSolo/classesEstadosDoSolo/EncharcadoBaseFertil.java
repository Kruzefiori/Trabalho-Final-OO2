package br.unifei.imc.EstadoDoSolo.classesEstadosDoSolo;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import br.unifei.imc.EstadoDoSolo.corrige.Corrige;
import br.unifei.imc.EstadoDoSolo.corrige.CorrigeFertilizante;
import br.unifei.imc.EstadoDoSolo.corrige.CorrigePh;
import br.unifei.imc.EstadoDoSolo.corrige.CorrigeUmidade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import br.unifei.imc.plantacaoTipo.classes.*;
import br.unifei.imc.plantacaoTipo.Plantacao;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EncharcadoBaseFertil implements ProblemaSolo {
    private int umidade, ph, fert;
    private Corrige corrigeumidade;
    private Corrige corrigeph;

    public EncharcadoBaseFertil(int umidade, int ph, int fert) {
        this.umidade = umidade;
        this.ph = ph;
        this.fert = fert;
        this.corrigeumidade = new CorrigeUmidade();
        this.corrigeph = new CorrigePh() ;
    }
    @Override
    public void corrigeSolo(Plantacao plantacao) {

        this.corrigeumidade.corrige_solo(plantacao, this.umidade,this.ph, this.fert);
        this.corrigeph.corrige_solo(plantacao, this.umidade,this.ph, this.fert);

    }

    }

