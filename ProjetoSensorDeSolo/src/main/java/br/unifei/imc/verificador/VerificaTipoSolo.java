package br.unifei.imc.verificador;

import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;
import br.unifei.imc.observadores.ObservaTipoSolo;
import br.unifei.imc.observadores.Observador;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: Victor Kruze
 * @Fuction: Retorna o tipo de solo de acordo com os valores de humidade, fertilização e o nível de ph
 * @Params: int Humidade, int Fertilização, int ph
 */

public class VerificaTipoSolo implements Observavel{

    private List<Observador> observadores;

    public VerificaTipoSolo(){
        observadores = new ArrayList<>();
        this.registrar(new ObservaTipoSolo());
    }

    @Override
    public void registrar(Observador obs) {observadores.add(obs);}

    @Override
    public void cancelar(Observador obs) {observadores.remove(obs);}

    public TiposEstadoDoSolo retornaTipo(int humidade , int fert, int ph){
        TiposEstadoDoSolo tipo;
        if (humidade > 80){
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: ENCHARCADO_ACIDO_FERTIL\n");
                    tipo = TiposEstadoDoSolo.ENCHARCADO_ACIDO_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
                if (ph > 8){
                    System.out.println("Tipo identificado como: ENCHARCADO_BASE_FERTIL\n");
                    tipo = TiposEstadoDoSolo.ENCHARCADO_BASE_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }else {
                    System.out.println("Tipo identificado como: ENCHARCADO_NEUTRO_FERTIL\n");
                    tipo = TiposEstadoDoSolo.ENCHARCADO_NEUTRO_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: ENCHARCADO_ACIDO_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.ENCHARCADO_ACIDO_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
                if (ph > 8){
                    System.out.println("Tipo identificado como: ENCHARCADO_BASE_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.ENCHARCADO_BASE_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }else {
                    System.out.println("Tipo identificado como: ENCHARCADO_NEUTRO_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.ENCHARCADO_NEUTRO_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
            }
        }
        if (humidade < 30){
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: SECO_ACIDO_FERTIL\n");
                    tipo = TiposEstadoDoSolo.SECO_ACIDO_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
                if (ph > 8){
                    System.out.println("Tipo identificado como: SECO_BASE_FERTIL\n");
                    tipo = TiposEstadoDoSolo.SECO_BASE_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }else {
                    System.out.println("Tipo identificado como: SECO_NEUTRO_FERTIL\n");
                    tipo = TiposEstadoDoSolo.SECO_NEUTRO_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: SECO_ACIDO_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.SECO_ACIDO_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
                if (ph > 8){
                    System.out.println("Tipo identificado como: SECO_BASE_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.SECO_BASE_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }else {
                    System.out.println("Tipo identificado como: SECO_NEUTRO_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.SECO_NEUTRO_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
            }
        }else {
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: UMIDO_ACIDO_FERTIL\n");
                    tipo = TiposEstadoDoSolo.UMIDO_ACIDO_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
                if (ph > 8){
                    System.out.println("Tipo identificado como: UMIDO_BASE_FERTIL\n");
                    tipo = TiposEstadoDoSolo.UMIDO_BASE_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }else {
                    System.out.println("Tipo identificado como: UMIDO_NEUTRO_FERTIL\n");
                    tipo = TiposEstadoDoSolo.UMIDO_NEUTRO_FERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: UMIDO_ACIDO_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.UMIDO_ACIDO_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
                if (ph > 8){
                    System.out.println("Tipo identificado como: UMIDO_BASE_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.UMIDO_BASE_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }else {
                    System.out.println("Tipo identificado como: UMIDO_NEUTRO_INFERTIL\n");
                    tipo = TiposEstadoDoSolo.UMIDO_NEUTRO_INFERTIL;
                    observadores.forEach(observador -> observador.atualiza(tipo));
                    return tipo;
                }
            }
        }
    }
}
