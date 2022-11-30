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
public class UmidoBaseInfertil implements ProblemaSolo {
<<<<<<< Updated upstream
    private int umidadeIni, phIni, fertIni;
    @Override
    public void corrigeSolo() {

    }
=======
    private int umidade, ph, fert;
       @Override
       public void corrigeSolo(Plantacao plantacao) {
            int umidadeIdeal = plantacao.getUmidade();
            int phIdeal = plantacao.getPh();
            int fertIdeal = plantacao.getFertilizante();
            
            System.out.println("Umidade Ideal >" + umidadeIdeal + " - Umidade atual >" + umidade);
            System.out.println("PH Ideal >" + phIdeal + " - PH atual >" + ph);
            System.out.println(" Fertilizante Ideal >" + fertIdeal + " - Fertilizante atual >" + fert);
            System.out.println("Efetuando correções do solo:");
                
            if(umidadeIdeal > umidade){
                System.out.println("Umidificando o solo...");
            }
            if(phIdeal < ph){
               System.out.println("Adicionando húmus...");
            } 
            if(fert < fertIdeal){
                System.out.println("Adicionando fertilizante...");
            }
       }
>>>>>>> Stashed changes
}
