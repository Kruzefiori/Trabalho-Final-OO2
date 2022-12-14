package br.unifei.imc.problemaSolo;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;

public abstract class FactoryProblemaSolo {

    protected int umidade, ph, fertilizante;

    public final ProblemaSolo devolveProblemaSolo (TiposEstadoDoSolo type ,int umidade , int ph, int fert){
        ProblemaSolo prob = null;
        prob = criaProblemaSolo(type ,umidade ,  ph,  fert);
        return prob;
    }

    abstract ProblemaSolo criaProblemaSolo(TiposEstadoDoSolo type , int umidade , int ph, int fert);

}
