package br.unifei.imc.EstadoDoSolo.classesEstadosDoSolo;

import br.unifei.imc.EstadoDoSolo.ProblemaSolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UmidoBaseInfertil implements ProblemaSolo {
    private int umidadeIni, phIni, fertIni;
    @Override
    public void corrigeSolo() {

    }
}
