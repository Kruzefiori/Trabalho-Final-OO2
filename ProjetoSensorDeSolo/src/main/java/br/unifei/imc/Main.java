/**
 * @Autores:  Ryan Ribeiro; Samuel Canellas; Victor Kruze; Vitória Thais.
 * @Matriculas: 2021008926; 2021032322; 2021005488; 2021013167
 * @Tema: Sensor de solo para máquinas agrícolas, que identifica a nessecidade do solo e ejeta o produto adequado para sua correção
 */



package br.unifei.imc;
import java.awt.GridBagLayout;
import javax.swing.*;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;
import br.unifei.imc.gerador.Rng;
import br.unifei.imc.LeituraSolo.LeituraSolo;
import br.unifei.imc.plantacaoTipo.Plantacao;
import br.unifei.imc.plantacaoTipo.classes.*;
import br.unifei.imc.problemaSolo.CriadorProblemaSolo;
import br.unifei.imc.problemaSolo.FactoryProblemaSolo;
import br.unifei.imc.verificador.VerificaTipoSolo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int tam = 1000000;//Não tem sentido pedir input já que é uma simulação de um sensor que percorre o solo, ele funciona enquanto faz a varredura
        System.out.println("Initializing sensor!\n\n");
        Rng gen = new Rng();//Gerador de números aleatórios
        ArrayList<LeituraSolo> leituraSoloArrayList = gen.CriaValores(tam);//Arraylist  correspondente aos pontos que o sensor reconheceria em um terreno passando pelo campo de tamanho Tamz
        for (int x = 0 ; x < tam ; x++) {
            int umidade = leituraSoloArrayList.get(x).getUmidade();
            int fert = leituraSoloArrayList.get(x).getFertilizante();
            int ph = leituraSoloArrayList.get(x).getPh();
            ProblemaSolo tipoDoSolo = null;
            int pos = x+1;
            System.out.println("O nível de Fertilizante da parte " + pos + " é: " + fert + "% --" + " O Ph é: " + ph + "-- A umidade é: " + umidade + "%");
            System.out.println("Identificando tipo de solo...");
            CriadorProblemaSolo cria = new CriadorProblemaSolo();
            TiposEstadoDoSolo type = new VerificaTipoSolo().retornaTipo(umidade, fert, ph);
            tipoDoSolo = cria.devolveProblemaSolo(type,  umidade ,  ph,  fert); // Factory para criar o tipo de problema do Solo
            //TODO: Faz a permanência no arquivo dos dados ATUAIS de leitura
            Plantacao m = new Milho();
            Plantacao a = new Arroz();
            Plantacao b = new Batata();
            Plantacao c = new Cafe();
            Plantacao s = new Soja();
            tipoDoSolo.corrigeSolo(a);//Strategy
            try { Thread.sleep (2000000); } catch (InterruptedException ex) {}
            //TODO:Faz a permanência no arquivo dos dados PÓS CORREÇÃO

            //TODO: excesso de uso de memória,armazena em txt e free? how?
        }
    }
}