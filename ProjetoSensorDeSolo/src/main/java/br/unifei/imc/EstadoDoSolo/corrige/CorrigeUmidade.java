package br.unifei.imc.EstadoDoSolo.corrige;

import br.unifei.imc.plantacaoTipo.Plantacao;

public class CorrigeUmidade implements Corrige{
    @Override
    public void corrige_solo(Plantacao plantacao, int umidade, int ph, int fert) {
        int umidadeIdeal = plantacao.getUmidade();

        System.out.println("Umidade Ideal >" + umidadeIdeal + " - Umidade atual >" + umidade);

        System.out.println("Efetuando correção do solo:");
        if(umidadeIdeal < umidade){
            System.out.println("Drenando o solo...");
        }
        if(umidadeIdeal > umidade){
            System.out.println("Umidificando o solo...");
        }

    }
}
