package br.unifei.imc.verificador;

import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;

/**
 * @author: Victor Kruze
 * @Fuction: Retorna o tipo de solo de acordo com os valores de humidade, fertilização e o nível de ph
 * @Params: int Humidade, int Fertilização, int ph
 */

public class VerificaTipoSolo {
    public TiposEstadoDoSolo retornaTipo(int humidade , int fert, int ph){
        if (humidade > 80){
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: ENCHARCADO_ACIDO_FERTIL\n");
                    return TiposEstadoDoSolo.ENCHARCADO_ACIDO_FERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: ENCHARCADO_BASE_FERTIL\n");
                    return TiposEstadoDoSolo.ENCHARCADO_BASE_FERTIL;
                }else {
                    System.out.println("Tipo identificado como: ENCHARCADO_NEUTRO_FERTIL\n");
                    return TiposEstadoDoSolo.ENCHARCADO_NEUTRO_FERTIL;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: ENCHARCADO_ACIDO_INFERTIL\n");
                    return TiposEstadoDoSolo.ENCHARCADO_ACIDO_INFERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: ENCHARCADO_BASE_INFERTIL\n");
                    return TiposEstadoDoSolo.ENCHARCADO_BASE_INFERTIL;
                }else {
                    System.out.println("Tipo identificado como: ENCHARCADO_NEUTRO_INFERTIL\n");
                    return TiposEstadoDoSolo.ENCHARCADO_NEUTRO_INFERTIL;
                }
            }
        }
        if (humidade < 30){
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: SECO_ACIDO_FERTIL\n");
                    return TiposEstadoDoSolo.SECO_ACIDO_FERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: SECO_BASE_FERTIL\n");
                    return TiposEstadoDoSolo.SECO_BASE_FERTIL;
                }else {
                    System.out.println("Tipo identificado como: SECO_NEUTRO_FERTIL\n");
                    return TiposEstadoDoSolo.SECO_NEUTRO_FERTIL;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: SECO_ACIDO_INFERTIL\n");
                    return TiposEstadoDoSolo.SECO_ACIDO_INFERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: SECO_BASE_INFERTIL\n");
                    return TiposEstadoDoSolo.SECO_BASE_INFERTIL;
                }else {
                    System.out.println("Tipo identificado como: SECO_NEUTRO_INFERTIL\n");
                    return TiposEstadoDoSolo.SECO_NEUTRO_INFERTIL;
                }
            }
        }else {
            if(fert > 60){
                if (ph < 5){
                    System.out.println("Tipo identificado como: UMIDO_ACIDO_FERTIL\n");
                    return TiposEstadoDoSolo.UMIDO_ACIDO_FERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: UMIDO_BASE_FERTIL\n");
                    return TiposEstadoDoSolo.UMIDO_BASE_FERTIL;
                }else {
                    System.out.println("Tipo identificado como: UMIDO_NEUTRO_FERTIL\n");
                    return TiposEstadoDoSolo.UMIDO_NEUTRO_FERTIL;
                }
            }else {
                if (ph < 5){
                    System.out.println("Tipo identificado como: UMIDO_ACIDO_INFERTIL\n");
                    return TiposEstadoDoSolo.UMIDO_ACIDO_INFERTIL;
                }
                else if (ph > 8){
                    System.out.println("Tipo identificado como: UMIDO_BASE_INFERTIL\n");
                    return TiposEstadoDoSolo.UMIDO_BASE_INFERTIL;
                }else {
                    System.out.println("Tipo identificado como: UMIDO_NEUTRO_INFERTIL\n");
                    return TiposEstadoDoSolo.UMIDO_NEUTRO_INFERTIL;
                }
            }
        }
    }
}
