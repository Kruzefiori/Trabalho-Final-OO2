/**
 * @Autores:  Ryan Ribeiro; Samuel Canellas; Victor Kruze; Vitória Thais.
 * @Matriculas: 2021008926; 2021032322; 2021005488; 2021013167
 * @Tema: Sensor de solo para máquinas agrícolas, que identifica a nessecidade do solo e ejeta o produto adequado para sua correção
 */



package br.unifei.imc;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import br.unifei.imc.gerador.Rng;
import br.unifei.imc.LeituraSolo.LeituraSolo;
import br.unifei.imc.problemaSolo.FactoryProblemaSolo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int tam = 10;//Não tem sentido pedir input já que é uma simulação de um sensor que percorre o solo, ele funciona enquanto faz a varredura
        System.out.println("Initializing sensor!");
        Rng gen = new Rng();//Gerador de números aleatórios
        ArrayList<LeituraSolo> leituraSoloArrayList = gen.CriaValores(tam);//Arraylist  correspondente aos pontos que o
        // sensor reconheceria em um terreno
        for (int x = 0 ; x < tam ; x++){
            System.out.println("O Fertilizante da parte " + x + " eh: " + leituraSoloArrayList.get(x).getFertilizante() + "%");
            System.out.println("O PH da parte " + x + " eh: " + leituraSoloArrayList.get(x).getPh());
            System.out.println("A umidade da parte " + x + " eh: " + leituraSoloArrayList.get(x).getUmidade()  + "%");
            System.out.println("\n");
            
            //Identifica o problema do solo a partir do ponto X
            //Regra:  fertilizante - humidade = x
            //Factory para criar o solo (solo usa o Strategy para implementar o método "corrige")
            //1 - se 40 <= x <= 60 - solo Ideal - não corrige nada
            //2 - se 60 <= x (fertilizante muito acima) - Solo hipernutrido - corrige com água
            //3 - se 40 >= x (água muito acima) - Solo hiperHumido - corrige com Ferti
            // +...

        }




    }
}