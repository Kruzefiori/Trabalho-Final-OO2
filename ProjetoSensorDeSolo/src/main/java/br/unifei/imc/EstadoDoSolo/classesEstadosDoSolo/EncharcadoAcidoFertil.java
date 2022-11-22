package br.unifei.imc.EstadoDoSolo.classesEstadosDoSolo;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EncharcadoAcidoFertil implements ProblemaSolo {
    private int umidadeIni, phIni, fertIni;
        @Override
    public void corrigeSolo() {
            int umidadeIdeal = 60 , phIdeal = 7, fertIdeal = 60;
            System.out.println("Umidade Ideal >" + umidadeIdeal + " - Umidade atual >" + umidadeIni);
            System.out.println("PH Ideal >" + phIdeal + " - PH atual >" + phIni);
            System.out.println(" Fertilizante Ideal >" + fertIdeal + " - Fertilizante atual >" + fertIni);
            System.out.println("Efetuando Correção do Solo");
    }
}
