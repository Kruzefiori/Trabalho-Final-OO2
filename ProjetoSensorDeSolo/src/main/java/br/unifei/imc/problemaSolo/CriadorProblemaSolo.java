package br.unifei.imc.problemaSolo;
import br.unifei.imc.EstadoDoSolo.*;
import br.unifei.imc.EstadoDoSolo.classesEstadosDoSolo.*;

public class CriadorProblemaSolo extends FactoryProblemaSolo {
    @Override
    ProblemaSolo criaProblemaSolo(TiposEstadoDoSolo type , int umidade , int ph, int fert) {
        if(type == TiposEstadoDoSolo.ENCHARCADO_ACIDO_FERTIL)
            return new EncharcadoAcidoFertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_ACIDO_INFERTIL)
            return new EncharcadoAcidoInfertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_BASE_FERTIL)
            return new EncharcadoBaseFertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_BASE_INFERTIL)
            return new EncharcadoBaseInfertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_NEUTRO_FERTIL)
            return new EncharcadoNeutroFertil(umidade , ph , fert);//ok
        if(type == TiposEstadoDoSolo.ENCHARCADO_NEUTRO_INFERTIL)
            return new EncharcadoNeutroInfertil(umidade , ph , fert);//ok
        if(type == TiposEstadoDoSolo.SECO_ACIDO_FERTIL)
            return new SecoAcidoFertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.SECO_ACIDO_INFERTIL)
            return new SecoAcidoInfertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.SECO_BASE_FERTIL)
            return new SecoBaseFertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.SECO_BASE_INFERTIL)
            return new SecoBaseInfertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.SECO_NEUTRO_FERTIL)
            return new SecoNeutroFertil(umidade , ph , fert);//ok
        if(type == TiposEstadoDoSolo.SECO_NEUTRO_INFERTIL)
            return new SecoNeutroInfertil(umidade , ph , fert);//ok
        if(type == TiposEstadoDoSolo.UMIDO_ACIDO_FERTIL)
            return new UmidoAcidoFertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.UMIDO_ACIDO_INFERTIL)
            return new UmidoAcidoInfertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.UMIDO_BASE_FERTIL)
            return new UmidoBaseFertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.UMIDO_BASE_INFERTIL)
            return new UmidoBaseInfertil(umidade , ph , fert);//ok
        if (type == TiposEstadoDoSolo.UMIDO_NEUTRO_FERTIL)
            return new UmidoNeutroFertil(umidade , ph , fert);//ok
        if(type == TiposEstadoDoSolo.UMIDO_NEUTRO_INFERTIL)
            return new UmidoNeutroInfertil(umidade , ph , fert);//ok
        else return null;
    }

}
