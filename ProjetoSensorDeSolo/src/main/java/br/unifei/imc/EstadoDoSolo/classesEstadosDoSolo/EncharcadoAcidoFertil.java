package br.unifei.imc.EstadoDoSolo.classesEstadosDoSolo;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
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
public class EncharcadoAcidoFertil implements ProblemaSolo {
    private int umidade, ph, fert;
        @Override
    public void corrigeSolo(Plantacao plantacao) {
            int umidadeIdeal = plantacao.getUmidade(),
            int phIdeal = plantacao.getPh(),
            int fertIdeal = plantacao.getFertilizante();
            
            System.out.println("Umidade Ideal >" + umidadeIdeal + " - Umidade atual >" + umidadeIni);
            System.out.println("PH Ideal >" + phIdeal + " - PH atual >" + phIni);
            System.out.println(" Fertilizante Ideal >" + fertIdeal + " - Fertilizante atual >" + fertIni);
            System.out.println("Efetuando correções do solo:");

            if(umidadeIdeal < umidade){
                System.out.println("Drenando o solo...");
            }
            if(phIdeal > ph){
                System.out.println("Adicionando calcário...");
            }
    }
}