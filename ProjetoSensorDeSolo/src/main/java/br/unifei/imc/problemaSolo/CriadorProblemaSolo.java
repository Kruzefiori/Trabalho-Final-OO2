package br.unifei.imc.problemaSolo;
import br.unifei.imc.EstadoDoSolo.*;
import br.unifei.imc.EstadoDoSolo.classes.*;

public class CriadorProblemaSolo extends FactoryProblemaSolo {
    @Override
    ProblemaSolo criaProblemaSolo(TiposEstadoDoSolo type) {
        if(type == TiposEstadoDoSolo.ENCHARCADO_ACIDO_FERTIL)
            return new EncharcadoAcidoFertil();//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_ACIDO_INFERTIL)
            return new EncharcadoAcidoInfertil();//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_BASE_FERTIL)
            return new EncharcadoBaseFertil();//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_BASE_INFERTIL)
            return new EncharcadoBaseInfertil();//ok
        if (type == TiposEstadoDoSolo.ENCHARCADO_NEUTRO_FERTIL)
            return new EncharcadoNeutroFertil();//ok
        if(type == TiposEstadoDoSolo.ENCHARCADO_NEUTRO_INFERTIL)
            return new EncharcadoNeutroInfertil();//ok
        if(type == TiposEstadoDoSolo.SECO_ACIDO_FERTIL)
            return new SecoAcidoFertil();//ok
        if (type == TiposEstadoDoSolo.SECO_ACIDO_INFERTIL)
            return new SecoAcidoInfertil();//ok
        if (type == TiposEstadoDoSolo.SECO_BASE_FERTIL)
            return new SecoBaseFertil();//ok
        if (type == TiposEstadoDoSolo.SECO_BASE_INFERTIL)
            return new SecoBaseInfertil();//ok
        if (type == TiposEstadoDoSolo.SECO_NEUTRO_FERTIL)
            return new SecoNeutroFertil();//ok
        if(type == TiposEstadoDoSolo.SECO_NEUTRO_INFERTIL)
            return new SecoNeutroInfertil();//ok
        if(type == TiposEstadoDoSolo.UMIDO_ACIDO_FERTIL)
            return new UmidoAcidoFertil();//ok
        if (type == TiposEstadoDoSolo.UMIDO_ACIDO_INFERTIL)
            return new UmidoAcidoInfertil();//ok
        if (type == TiposEstadoDoSolo.UMIDO_BASE_FERTIL)
            return new UmidoBaseFertil();//ok
        if (type == TiposEstadoDoSolo.UMIDO_BASE_INFERTIL)
            return new UmidoBaseInfertil();//ok
        if (type == TiposEstadoDoSolo.UMIDO_NEUTRO_FERTIL)
            return new UmidoNeutroFertil();//ok
        if(type == TiposEstadoDoSolo.UMIDO_NEUTRO_INFERTIL)
            return new UmidoNeutroInfertil();//ok
        else return null;
    }
}
