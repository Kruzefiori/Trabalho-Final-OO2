package br.unifei.imc.observadores;

import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ObservaTipoSolo implements Observador{

    File file = new File("tipoSolo.txt");


    @Override
    public void atualiza(TiposEstadoDoSolo tipo) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.flush();
        pw.println("O tipo do solo da ultima plantacao analisada é:");
        pw.println(tipo);
        pw.close();
    }
}
