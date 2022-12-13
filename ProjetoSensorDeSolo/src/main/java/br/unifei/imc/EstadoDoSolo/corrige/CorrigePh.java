package br.unifei.imc.EstadoDoSolo.corrige;

import br.unifei.imc.plantacaoTipo.Plantacao;

public class CorrigePh implements Corrige{
    public void corrige_solo(Plantacao plantacao, int umidade, int ph, int fert) {
        int phIdeal = plantacao.getPh();

        System.out.println("PH Ideal >" + phIdeal + " - PH atual >" + ph);

        if(phIdeal > ph){
            System.out.println("Adicionando calcário...");
        }
        if(phIdeal < ph){
            System.out.println("Adicionando húmus...");
        }

    }
}
