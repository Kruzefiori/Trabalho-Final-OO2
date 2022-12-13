package br.unifei.imc.gerador;

import br.unifei.imc.LeituraSolo.LeituraSolo;
import lombok.AllArgsConstructor;

import java.util.*;

/**
 *
 */
@AllArgsConstructor
public class Rng {

    public ArrayList<LeituraSolo>  CriaValores(int x){
        ArrayList<LeituraSolo> leituraSoloArrayList = new ArrayList<>();
        Random gerador = new Random(42);
        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < x; i++) {
            LeituraSolo leituraSoloValues = new LeituraSolo();
            leituraSoloValues.setUmidade((gerador.nextInt(101)));
            leituraSoloValues.setPh((gerador.nextInt(15)));
            leituraSoloValues.setFertilizante((gerador.nextInt(101)));
            leituraSoloArrayList.add(leituraSoloValues);
        }

        return leituraSoloArrayList;
    }
}
