package br.unifei.imc.EstadoDoSolo.corrige;

import br.unifei.imc.plantacaoTipo.Plantacao;

public class CorrigeFertilizante implements Corrige{

    @Override
    public void corrige_solo(Plantacao plantacao, int umidade, int ph, int fert) {
        int fertIdeal = plantacao.getFertilizante();

        System.out.println(" Fertilizante Ideal >" + fertIdeal + " - Fertilizante atual >" + fert);
        System.out.println("Efetuando correção do solo:");
        if(fert < fertIdeal){
            System.out.println("Adicionando fertilizante...");
        }
        System.out.println("Correção finalizada.\n");
    }

}
