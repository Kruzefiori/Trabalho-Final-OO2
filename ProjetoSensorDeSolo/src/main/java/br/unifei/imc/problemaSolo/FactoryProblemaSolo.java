package br.unifei.imc.problemaSolo;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;

public abstract class FactoryProblemaSolo {

    protected int humidade, ph, fertilizante;

    public final ProblemaSolo devolveProblemaSolo (TiposEstadoDoSolo type){
        ProblemaSolo prob = null;
        prob = criaProblemaSolo(type);
        return prob;
    }

    abstract ProblemaSolo criaProblemaSolo(TiposEstadoDoSolo type);

}
