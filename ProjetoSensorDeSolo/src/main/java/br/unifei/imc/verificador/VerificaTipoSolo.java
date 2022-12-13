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
        var ref = new Object() {
            TiposEstadoDoSolo tipo;
        };
        if (humidade > 80){
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: ENCHARCADO_ACIDO_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.ENCHARCADO_ACIDO_FERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: ENCHARCADO_BASE_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.ENCHARCADO_BASE_FERTIL;
                }else {
                    System.out.println("Tipo identificado como: ENCHARCADO_NEUTRO_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.ENCHARCADO_NEUTRO_FERTIL;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: ENCHARCADO_ACIDO_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.ENCHARCADO_ACIDO_INFERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: ENCHARCADO_BASE_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.ENCHARCADO_BASE_INFERTIL;
                }else {
                    System.out.println("Tipo identificado como: ENCHARCADO_NEUTRO_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.ENCHARCADO_NEUTRO_INFERTIL;
                }
            }
        }
        else if (humidade < 30){
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: SECO_ACIDO_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.SECO_ACIDO_FERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: SECO_BASE_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.SECO_BASE_FERTIL;
                }else {
                    System.out.println("Tipo identificado como: SECO_NEUTRO_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.SECO_NEUTRO_FERTIL;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: SECO_ACIDO_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.SECO_ACIDO_INFERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: SECO_BASE_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.SECO_BASE_INFERTIL;
                }else {
                    System.out.println("Tipo identificado como: SECO_NEUTRO_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.SECO_NEUTRO_INFERTIL;
                }
            }
        }else {
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: UMIDO_ACIDO_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.UMIDO_ACIDO_FERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: UMIDO_BASE_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.UMIDO_BASE_FERTIL;
                }else {
                    System.out.println("Tipo identificado como: UMIDO_NEUTRO_FERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.UMIDO_NEUTRO_FERTIL;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: UMIDO_ACIDO_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.UMIDO_ACIDO_INFERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: UMIDO_BASE_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.UMIDO_BASE_INFERTIL;
                }else {
                    System.out.println("Tipo identificado como: UMIDO_NEUTRO_INFERTIL\n");
                    ref.tipo = TiposEstadoDoSolo.UMIDO_NEUTRO_INFERTIL;
                }
            }
        }
        observadores.forEach(observador -> observador.atualiza(ref.tipo, humidade, fert, ph));
        return ref.tipo;
    }
}
