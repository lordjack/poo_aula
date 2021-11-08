package slides.slide13;

import java.util.HashMap;
import java.util.Iterator;

public class PrincipalHashMap {
    public static void main(String[] args) {
        HashMap<String, String> siglas = new HashMap<String, String>();

        // adicionando chaves e valores (Sigla, Nome Protocolo)
        siglas.put("IP", "Internet Protocol");
        siglas.put("FTP", "File Transfer Protocol");
        siglas.put("HTTP", "Hypertext Transfer Protocol");

        System.out.println(siglas.get("IP"));
        System.out.println(siglas.get("FTP"));
        System.out.println(siglas.get("HTTP"));
/*
        for (Iterator it = <colecao>.iterator(); it.hasNext() ; ) {
            <Tipo> <referencia> (<Tipo>) it.next();
        }

        Iterator it = <colecao>.iterator();
        while (it.hasNext()){
            <Tipo> <referencia> (<Tipo>) it.next();
        }

        for (<Tipo> <referencia> : <colecao>) {
            //usa a <referencia>;
        }

 */
    }
}
