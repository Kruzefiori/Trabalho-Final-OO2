package br.unifei.imc.observadores;

import br.unifei.imc.EstadoDoSolo.TiposEstadoDoSolo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ObservaTipoSolo implements Observador{

    File file = new File("tipoSolo.txt");


    @Override
    public void atualiza(TiposEstadoDoSolo tipo, int um, int fert, int ph) {
        //Cria um arquivo .txt com as informações de tipo, umidade, fertilizante e ph. Sobrescreve o antigo, caso haja.
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.flush();
        pw.println("O tipo do solo da ultima plantacao analisada é:");
        pw.println(tipo);
        pw.println("Seus atributos são:\nUmidade: " + um + " - Fertilizante: " + fert + " - Ph: " + ph);
        pw.close();



        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        //Cria um arquivo contendo o tipo, umidade, fertilizante e ph, no formato xml.
        Document document = documentBuilder.newDocument();
        Element rootElement = document.createElement("relatorioSolo");
        document.appendChild(rootElement);
        Element tipoSolo = document.createElement("tipo");
        tipoSolo.appendChild(document.createTextNode(String.valueOf(tipo)));
        rootElement.appendChild(tipoSolo);
        Element umidade = document.createElement("umidade");
        umidade.appendChild(document.createTextNode(String.valueOf(um)));
        rootElement.appendChild(umidade);
        Element fertilizante = document.createElement("fertilizante");
        fertilizante.appendChild(document.createTextNode(String.valueOf(fert)));
        rootElement.appendChild(fertilizante);
        Element pH = document.createElement("ph");
        pH.appendChild(document.createTextNode(String.valueOf(ph)));
        rootElement.appendChild(pH);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        }
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(System.out);
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n");
    }
}
